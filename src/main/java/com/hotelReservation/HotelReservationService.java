package com.hotelReservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {

    List<Hotel> hotels=new ArrayList<Hotel>();

    /**
     * Add hotel method to add hotel in list
     * @param hotel
     */
    public void addHotel(Hotel hotel){
        this.hotels.add(hotel);
    }

    /**
     * It will give hotel list
     * @return
     */
    public List<Hotel> getHotels(){
        return hotels;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
    }
}
