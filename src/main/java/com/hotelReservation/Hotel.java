package com.hotelReservation;

public class Hotel {
    /**
     * properties of Hotel class
     */
    private String hotelName;
    private double dailyRate,weekDayRate,weekEndRate;
    
    /**
     * Added Parameterized constructor with three different parameter
     * @param hotelName
     * @param weekDayRate
     * @param weekEndRate
     */
    public Hotel(String hotelName, double weekDayRate, double weekEndRate) {
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
    }

    /**
     * Parameterized constructor
     * @param hotelName
     * @param dailyRate
     */
    public Hotel(String hotelName, double dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
    }

    /**
     * Setters
     * @return
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * @return daily customer rate
     */
    public double getDailyRate() {
        return dailyRate;
    }

    /**
     * set daily rate
     * @param
     */
    public void setDailyRate(int noOfDays) {
        this.dailyRate = this.dailyRate*noOfDays;
    }

    /**
     * it is an overridden methode to display Hotel name and daily rate
     * @return
     */
    @Override
    public String toString() {
        return "Hotel{" + "hotelName='" + hotelName + '\'' + ", dailyRate=" + dailyRate + '}';
    }
}
