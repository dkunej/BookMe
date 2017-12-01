package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ROOM_AMENITIES")
public class RoomAmenities {

    @Id
    @Column(name = "amenities_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int amenitiesID;

    @Column(name = "crib")
    private boolean crib;

    @Column(name = "hairdryer")
    private boolean hairdryer;

    @Column(name = "kettle")
    private boolean kettle;

    @Column(name = "washing_machine")
    private boolean washingMachine;

    @Column(name = "microwave")
    private boolean microwave;

    @Column(name = "refrigerator")
    private boolean refrigerator;

    @Column(name = "tv")
    private boolean tv;

    @Column(name = "cable")
    private boolean cable;

    @OneToMany(mappedBy = "room_amenities_amenities_ID")
    private Set<Room> rooms;

    public RoomAmenities() {
    }


    public int getAmenitiesID() {
        return amenitiesID;
    }

    public void setAmenitiesID(int amenitiesID) {
        this.amenitiesID = amenitiesID;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public boolean isCrib() {
        return crib;
    }

    public void setCrib(boolean crib) {
        this.crib = crib;
    }

    public boolean isHairdryer() {
        return hairdryer;
    }

    public void setHairdryer(boolean hairdryer) {
        this.hairdryer = hairdryer;
    }

    public boolean isKettle() {
        return kettle;
    }

    public void setKettle(boolean kettle) {
        this.kettle = kettle;
    }

    public boolean isWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean isMicrowave() {
        return microwave;
    }

    public void setMicrowave(boolean microwave) {
        this.microwave = microwave;
    }

    public boolean isRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(boolean refrigerator) {
        this.refrigerator = refrigerator;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isCable() {
        return cable;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }
}
