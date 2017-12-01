package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Daniela on 09-Nov-17.
 */

@Entity
@Table(name = "HOTEL")
public class Hotel {

    @Id
    @Column(name = "hotel_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;

    @ManyToOne
    @JoinColumn(name = "checkin_start_date_ID", referencedColumnName = "date_ID")
    private Date checkinStartDateId;

    @ManyToOne
    @JoinColumn(name = "checkin_end_date_ID", referencedColumnName = "date_ID")
    private Date checkinEndDateId;

    @ManyToOne
    @JoinColumn(name = "checkout_start_date_ID", referencedColumnName = "date_ID")
    private Date checkoutStartDateId;

    @ManyToOne
    @JoinColumn(name = "checkout_end_date_ID", referencedColumnName = "date_ID")
    private Date checkoutEndDateId;

    @OneToMany(mappedBy = "hotelId")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "hotelId")
    private List<Room> rooms;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String hotelDescription;

    @Column(name = "stars")
    private int stars;

    @Column(name = "image")
    private byte[] image;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_ID")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "hotel_amenities_amenities_ID")
    private HotelAmenities hotelAmenities;



    public Hotel() {
    }

    public Hotel(String some_name) {
        name = some_name;
    }

    public Hotel(int hotelId) {
        this.hotelId = hotelId;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return name;
    }

    public void setHotelName(String hotelName) {
        this.name = hotelName;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getCheckinStartDateId() {
        return checkinStartDateId;
    }

    public void setCheckinStartDateId(Date checkinStartDateId) {
        this.checkinStartDateId = checkinStartDateId;
    }

    public Date getCheckinEndDateId() {
        return checkinEndDateId;
    }

    public void setCheckinEndDateId(Date checkinEndDateId) {
        this.checkinEndDateId = checkinEndDateId;
    }

    public Date getCheckoutStartDateId() {
        return checkoutStartDateId;
    }

    public void setCheckoutStartDateId(Date checkoutStartDateId) {
        this.checkoutStartDateId = checkoutStartDateId;
    }

    public Date getCheckoutEndDateId() {
        return checkoutEndDateId;
    }

    public void setCheckoutEndDateId(Date checkoutEndDateId) {
        this.checkoutEndDateId = checkoutEndDateId;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public HotelAmenities getHotelAmenities() {
        return hotelAmenities;
    }

    public void setHotelAmenities(HotelAmenities hotelAmenities) {
        this.hotelAmenities = hotelAmenities;
    }
}
