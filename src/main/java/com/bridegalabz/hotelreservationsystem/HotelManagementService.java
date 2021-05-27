package com.bridegalabz.hotelreservationsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelManagementService {
    public List<Hotel> hotelReservationList = new ArrayList<Hotel>();
    Hotel hotel=new Hotel();
    public static boolean printWelcome(String welcome) {
        System.out.println("Welcome");
        return true;

    }

    public boolean addHotel(Hotel O) {
        return hotelReservationList.add(O);
    }

    public String findCheapHotelRate(LocalDate intialDate, LocalDate finalDate)
    {
        int rate= hotel.getCheapRate(intialDate,finalDate,hotelReservationList);
        String hotelName=hotel.findHotel(rate,hotelReservationList);
        return hotelName;
    }
}
