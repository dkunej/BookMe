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
    private int hotelId;

    @ManyToOne
    @JoinColumn(name = "checkin_start_date_ID", referencedColumnName = "date_ID")
    private Date checkinStartDateId_fk;

    @ManyToOne
    @JoinColumn(name = "checkin_end_date_ID", referencedColumnName = "date_ID")
    private Date checkinEndDateId_fk;

    @ManyToOne
    @JoinColumn(name = "checkout_start_date_ID_fk", referencedColumnName = "date_ID")
    private Date checkoutStartDateId_fk;

    @ManyToOne
    @JoinColumn(name = "checkout_end_date_ID_fk", referencedColumnName = "date_ID")
    private Date checkoutEndDateId_fk;

    @OneToMany(mappedBy = "hotelId")
    private List<Booking> bookings;

    @Column(name = "name")
    private String hotelName;

    @Column(name = "description")
    private String hotelDescription;

    @Column(name = "stars")
    private int stars;

    @Column(name = "image")
    private byte[] image;

    @OneToOne(mappedBy = "hotelId")
    private Address address;

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
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public Date getCheckinStartDateId_fk() {
        return checkinStartDateId_fk;
    }

    public void setCheckinStartDateId_fk(Date checkinStartDateId_fk) {
        this.checkinStartDateId_fk = checkinStartDateId_fk;
    }

    public Date getCheckinEndDateId_fk() {
        return checkinEndDateId_fk;
    }

    public void setCheckinEndDateId_fk(Date checkinEndDateId_fk) {
        this.checkinEndDateId_fk = checkinEndDateId_fk;
    }

    public Date getCheckoutStartDateId_fk() {
        return checkoutStartDateId_fk;
    }

    public void setCheckoutStartDateId_fk(Date checkoutStartDateId_fk) {
        this.checkoutStartDateId_fk = checkoutStartDateId_fk;
    }

    public Date getCheckoutEndDateId_fk() {
        return checkoutEndDateId_fk;
    }

    public void setCheckoutEndDateId_fk(Date checkoutEndDateId_fk) {
        this.checkoutEndDateId_fk = checkoutEndDateId_fk;
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
}
