package com.bridegalabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementService
{
    public List<Hotel> hotelReservationList =new ArrayList<Hotel>();
    public static boolean printWelcome(String welcome)
    {
        System.out.println("Welcome");
        return true;
    }

    public boolean addHotel(Hotel O)
    {
        return hotelReservationList.add(O);
    }
}
