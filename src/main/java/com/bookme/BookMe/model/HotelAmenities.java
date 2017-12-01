package com.bookme.BookMe.model;

import javax.persistence.*;

@Entity
@Table(name = "HOTEL_AMENITIES")
public class HotelAmenities {

    @Id
    @Column(name = "hotel_amenities_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int amenitiesID;

    @Column(name = "WIFI")
    private boolean wifi;

    @Column(name = "PARKING")
    private boolean parking;

    @Column(name = "POOL")
    private boolean pool;

    @Column(name = "SPA")
    private boolean spa;

    @Column(name = "SHUTTLE_SERVICE")
    private boolean shuttleService;

    @Column(name = "DRY_CLEANING")
    private boolean dryCleaning;


    public HotelAmenities() {
    }

    public HotelAmenities(boolean wifi, boolean parking, boolean pool, boolean spa, boolean shuttle_service, boolean dry_cleaning) {
        this.wifi = wifi;
        this.parking = parking;
        this.pool = pool;
        this.spa = spa;
        this.shuttleService = shuttle_service;
        this.dryCleaning = dry_cleaning;
    }

    //------- Getters and setters -----------------
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
}
