package com.bridegalabz.hotelreservationsystem;

public class Rate
{
    public int getRateOfHotel() {
        return rateOfHotel;
    }

    public void setRateOfHotel(int rateOfHotel) {
        this.rateOfHotel = rateOfHotel;
    }

    private int rateOfHotel;

    public Rate(int rateOfHotel)
    {
        this.rateOfHotel = rateOfHotel;
    }
}
