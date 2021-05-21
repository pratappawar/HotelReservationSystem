package com.hotelReservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HotelReservationServiceTest {

    /**
     * Test case to check the given hotel added in HotelReservation or not
     */
    @Test
    public void when_Added_Given_Hotel_To_HotelReservationSystem_Should_PassTestCase() {
        HotelReservationService hotels = new HotelReservationService();
        Hotel hotel = new Hotel("Lakewood", 110);
        hotels.addHotel(hotel);
        List hotelsList = hotels.getHotels();
        Assertions.assertTrue(hotelsList.contains(hotel));
    }

    /**
     * Test case to give cheapest hotel
     */
    @Test
    public void find_CheapestHotel_In_List_Should_PassTestCase() {
        HotelReservationService hotels = new HotelReservationService();
        Hotel hotel1 = new Hotel("Lakewood", 110);
        Hotel hotel2 = new Hotel("BridgeWood", 210);
        Hotel hotel3 = new Hotel("RidgeWood", 110);
        hotels.addHotel(hotel1);
        hotels.addHotel(hotel2);
        hotels.addHotel(hotel3);
        int days = hotels.noOfDays("2021-05-21", "2021-05-26");
        Hotel result = hotels.findCheapestHotel(days);
        Assertions.assertEquals(hotel1, result);
    }
}
