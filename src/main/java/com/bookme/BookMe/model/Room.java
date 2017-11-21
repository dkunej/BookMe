package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Daniela on 09-Nov-17.
 */

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column(name = "room_ID", nullable = false)
    private int roomId;

    @Column(name = "name", nullable = false)
    private String roomName;

    @Column(name = "persons", nullable = false)
    private int persons;

    @ManyToOne
    @JoinColumn(name = "hotel_hotel_ID", nullable = false)
    private Room hotelId;

    @Column(name = "price")
    private double price;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "pansion")
    private String pansion;

    @Column(name = "king_beds")
    private int king_beds;

    @Column(name = "queen_beds")
    private int queen_beds;

    @Column(name = "small_beds")
    private int small_beds;

    @Column(name = "extra_beds")
    private int extra_beds;

    @ManyToOne
    @JoinColumn(name = "room_amenities_amenities_ID")
    private RoomAmenities room_amenities_amenities_ID;

    @OneToMany(mappedBy = "unavailabilityID")
    private Set<RoomUnavailability> unavailabilities;

    @ManyToMany
    @JoinTable(name = "room_photos_has_room", joinColumns = {
            @JoinColumn(name = "room_ID", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "photo_ID", nullable = false)})
    private Set<RoomPhotos> photos;

    public Room(int roomId, String roomName, int persons, Room hotelId_fk, double price, boolean availability, String pansion, int king_beds, int queen_beds, int small_beds, int extra_beds, RoomAmenities room_amenities_amenities_ID, Set<RoomUnavailability> unavailabilities, Set<RoomPhotos> photos) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.persons = persons;
        this.hotelId = hotelId_fk;
        this.price = price;
        this.availability = availability;
        this.pansion = pansion;
        this.king_beds = king_beds;
        this.queen_beds = queen_beds;
        this.small_beds = small_beds;
        this.extra_beds = extra_beds;
        this.room_amenities_amenities_ID = room_amenities_amenities_ID;
        this.unavailabilities = unavailabilities;
        this.photos = photos;
    }

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

    public Room getHotelId() {
        return hotelId;
    }

    public void setHotelId(Room hotelId_fk) {
        this.hotelId = hotelId_fk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public int getKing_beds() {
        return king_beds;
    }

    public void setKing_beds(int king_beds) {
        this.king_beds = king_beds;
    }

    public int getQueen_beds() {
        return queen_beds;
    }

    public void setQueen_beds(int queen_beds) {
        this.queen_beds = queen_beds;
    }

    public int getSmall_beds() {
        return small_beds;
    }

    public void setSmall_beds(int small_beds) {
        this.small_beds = small_beds;
    }

    public int getExtra_beds() {
        return extra_beds;
    }

    public void setExtra_beds(int extra_beds) {
        this.extra_beds = extra_beds;
    }

    public RoomAmenities getRoom_amenities_amenities_ID() {
        return room_amenities_amenities_ID;
    }

    public void setRoom_amenities_amenities_ID(RoomAmenities room_amenities_amenities_ID) {
        this.room_amenities_amenities_ID = room_amenities_amenities_ID;
    }

    public Set<RoomUnavailability> getUnavailabilities() {
        return unavailabilities;
    }

    public void setUnavailabilities(Set<RoomUnavailability> unavailabilities) {
        this.unavailabilities = unavailabilities;
    }

    public Set<RoomPhotos> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<RoomPhotos> photos) {
        this.photos = photos;
    }
}
