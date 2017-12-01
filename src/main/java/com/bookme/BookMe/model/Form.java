package com.bookme.BookMe.model;

public class Form {
    private String city;
    private int numPeople;
    private String checkinDate;
    private String checkoutDate;
    private int stars;
    private boolean wifi;
    private boolean parking;
    private boolean pool;
    private boolean spa;
    private boolean shuttleService;
    private boolean dryCleaning;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isShuttleService() {
        return shuttleService;
    }

    public void setShuttleService(boolean shuttleService) {
        this.shuttleService = shuttleService;
    }

    public boolean isDryCleaning() {
        return dryCleaning;
    }

    public void setDryCleaning(boolean dryCleaning) {
        this.dryCleaning = dryCleaning;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}