package com.hotelReservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HotelReservationSystemTest {

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
}
