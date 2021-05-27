package com.bridegalabz.hotelreservationsystem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.temporal.ChronoUnit.DAYS;

public class Hotel
{

    private String name;
    private  Map<CustomerType ,Rate> rate;
    private static int totalDays;
    public Hotel(String name, Map<CustomerType ,Rate> rate)
    {
        this.name = name;
        this.rate = rate;
    }
    Hotel(){};

    public static int getCheapRate(LocalDate intialDate, LocalDate finalDate, List<Hotel> hotelReservationList) {
        long noOfDaysBetween = DAYS.between(intialDate, finalDate);
        totalDays = (int) noOfDaysBetween + 1;
        //System.out.println( totalDays);
        int min = 0;
        int count = 0;
        int cheapRateArray[] = new int[hotelReservationList.size()];
        for (int i = 0; i < hotelReservationList.size(); i++) {
            Map<CustomerType, Rate> h1 = hotelReservationList.get(i).rate;
            for (Map.Entry<CustomerType, Rate> hotel : h1.entrySet()) {
                min = hotel.getValue().getRateOfHotel();
                cheapRateArray[count] = min;
                count++;
            }

        }
        Arrays.sort(cheapRateArray);
        return cheapRateArray[0] * totalDays;
    }
    public String findHotel(int rate, List<Hotel> hotelReservationList) {
        int hotelRate = rate / totalDays;
        for (int i = 0; i < hotelReservationList.size(); i++) {
            Map<CustomerType, Rate> h1 = hotelReservationList.get(i).getRate();
            for (Map.Entry<CustomerType, Rate> hotel : h1.entrySet()) {
                if (hotelRate == hotel.getValue().getRateOfHotel()) {
                    return hotelReservationList.get(i).getName();
                }

            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<CustomerType, Rate> getRate() {
        return rate;
    }

    public void setType(Map<CustomerType, Rate> rate) {
        this.rate = rate;
    }

}
