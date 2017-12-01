package com.bookme.BookMe.model;

import javax.persistence.*;

/**
 * Created by Daniela on 11-Nov-17.
 */

@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @Column(name = "bookingId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;


    @ManyToOne
    @JoinColumn(name = "user_user_ID", referencedColumnName = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "hotel_hotel_ID", referencedColumnName = "hotel_ID")
    private Hotel hotelId;

    @ManyToOne
    @JoinColumn(name = "booking_date_ID", referencedColumnName = "date_ID")
    private Date bookingDateId;

    @ManyToOne
    @JoinColumn(name = "checkin_date_ID", referencedColumnName = "date_ID")
    private Date checkinDateId;

    @ManyToOne
    @JoinColumn(name = "checkout_date_ID", referencedColumnName = "date_ID")
    private Date checkoutDateId;


    public Booking() {
    }

    public Booking(int bookingId, User userId, Hotel hotelId, Date bookingDateId, Date checkinDateId, Date checkoutDateId) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.hotelId = hotelId;
        this.bookingDateId = bookingDateId;
        this.checkinDateId = checkinDateId;
        this.checkoutDateId = checkoutDateId;
    }

    public Booking(User userId, Hotel hotelId, Date bookingDateId, Date checkinDateId, Date checkoutDateId) {
        this.userId = userId;
        this.hotelId = hotelId;
        this.bookingDateId = bookingDateId;
        this.checkinDateId = checkinDateId;
        this.checkoutDateId = checkoutDateId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    public Date getBookingDateId() {
        return bookingDateId;
    }

    public void setBookingDateId(Date bookingDateId) {
        this.bookingDateId = bookingDateId;
    }

    public Date getCheckinDateId() {
        return checkinDateId;
    }

    public void setCheckinDateId(Date checkinDateId) {
        this.checkinDateId = checkinDateId;
    }

    public Date getCheckoutDateId() {
        return checkoutDateId;
    }

    public void setCheckoutDateId(Date checkoutDateId) {
        this.checkoutDateId = checkoutDateId;
    }
}