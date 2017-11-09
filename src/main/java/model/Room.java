package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Daniela on 09-Nov-17.
 */

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column(name = "room_ID")
    private int roomId;

    @Column(name = "name")
    private String roomName;

    @Column(name = "persons")
    private int persons;

    @Column(name = "hotel_hotel_ID")
    private int hotelId_fk;

    @Column(name = "price")
    private int price;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "pansion")
    private String pansion;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getHotelId_fk() {
        return hotelId_fk;
    }

    public void setHotelId_fk(int hotelId_fk) {
        this.hotelId_fk = hotelId_fk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getPansion() {
        return pansion;
    }

    public void setPansion(String pansion) {
        this.pansion = pansion;
    }
}
