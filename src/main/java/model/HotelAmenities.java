package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL_AMENITIES")
public class HotelAmenities {

    @Id
    @Column(name = "HOTEL_HOTEL_ID", nullable = false)
    private int hotelID;
    @Column
    private boolean wifi;
    @Column
    private boolean parking;
    @Column
    private boolean pool;
    @Column
    private boolean spa;
    @Column
    private boolean shuttle_service;
    @Column
    private boolean dry_cleaning;

    public HotelAmenities(int hotelID, boolean wifi, boolean parking, boolean pool, boolean spa, boolean shuttle_service, boolean dry_cleaning) {
        this.hotelID = hotelID;
        this.wifi = wifi;
        this.parking = parking;
        this.pool = pool;
        this.spa = spa;
        this.shuttle_service = shuttle_service;
        this.dry_cleaning = dry_cleaning;
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

    public boolean isShuttle_service() {
        return shuttle_service;
    }

    public void setShuttle_service(boolean shuttle_service) {
        this.shuttle_service = shuttle_service;
    }

    public boolean isDry_cleaning() {
        return dry_cleaning;
    }

    public void setDry_cleaning(boolean dry_cleaning) {
        this.dry_cleaning = dry_cleaning;
    }
}
