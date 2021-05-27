package com.bridegalabz.hotelreservationsystem;

import java.util.HashMap;
import java.util.Map;

public class Hotel
{
    private String name;
    private  Map<CustomerType ,Rate> rate;

    public Hotel(String name, Map<CustomerType ,Rate> rate)
    {
        this.name = name;
        this.rate = rate;
    }
    Hotel(){};
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
