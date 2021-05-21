package com.hotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HotelReservationService {

    //Declared Arraylist with Type Hotel
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

    /**
     * Here i have get noOfDays which will help me to calculate daily rate
     * @param firstDate
     * @param lastDate
     * @return
     */
    public int noOfDays(String firstDate,String lastDate) {
        LocalDate startDate = LocalDate.parse(firstDate);
        LocalDate endDate = LocalDate.parse(lastDate);
        int noOfDays=(int) ChronoUnit.DAYS.between(startDate,endDate);
        return  noOfDays;
    }

    /**
     * methode to gives me Cheapest Hotel
     * here I have used stream
     * @param noOfDays
     * @return
     */
    public Hotel findCheapestHotel(int noOfDays) {
        hotels.stream().map(p -> {p.setDailyRate(noOfDays); return p.getDailyRate(); }).collect(Collectors.toList());
        Hotel cheapestRate =  hotels.stream().min(Comparator.comparing(Hotel::getDailyRate)).orElse(null);
        return cheapestRate;
    }

    /**
     * Welcome message is displayed
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");
    }
}
