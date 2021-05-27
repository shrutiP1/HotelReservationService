package com.bridegalabz.hotelreservationsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HotelManagementTest
{
    HotelManagementService hotelReservationService=new HotelManagementService();
    Hotel lakeWood,bridgeWood,ridgeWood;
    public void set()
    {
        HashMap<CustomerType ,Rate> customerTypeRateMap=new HashMap<>();
        customerTypeRateMap.put(CustomerType.REGULAR,new Rate(110));
        lakeWood=new Hotel("LakeWood",customerTypeRateMap);

        customerTypeRateMap=new HashMap<>();
        customerTypeRateMap.put(CustomerType.REGULAR,new Rate(160));
        bridgeWood =new Hotel("BridgeWood",customerTypeRateMap);

        customerTypeRateMap=new HashMap<>();
        customerTypeRateMap.put(CustomerType.REWARD,new Rate(220));
        ridgeWood=new Hotel("RidgeWood",customerTypeRateMap);
        hotelReservationService.addHotel(lakeWood);
        hotelReservationService.addHotel(bridgeWood);
        hotelReservationService.addHotel(ridgeWood);
    }
    @Test
    public void givenWelcomeMessageShouldDisplayWelcomeMesssage()
    {
        boolean ouput=HotelManagementService.printWelcome("Welcome");
        Assertions.assertTrue(ouput);
    }

    @Test
    public void givenHotel_WhenInvokedAddHotel_ShoulReturnInputData()
    {
        Assertions.assertTrue(hotelReservationService.addHotel(lakeWood));
    }

}
