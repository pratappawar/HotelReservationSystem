package com.hotelReservation;

public class Hotel {
    /**
     * properties of Hotel class
     */
    private String hotelName;
    private double dailyRate;

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
