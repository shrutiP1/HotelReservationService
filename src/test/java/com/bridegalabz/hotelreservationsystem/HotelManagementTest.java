package com.bridegalabz.hotelreservationsystem;

import org.junit.jupiter.api.Test;

public class HotelManagementTest
{
    @Test
    public void givenWelcomeMessageShouldDisplayWelcomeMesssage()
    {
        HotelManagementService.printWelcome("Welcome");
    }

}
