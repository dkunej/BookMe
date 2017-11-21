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
    private int bookingId;


    @ManyToOne
    @JoinColumn(name = "user_user_ID", referencedColumnName = "userId")
    private int userId;

    @ManyToOne
    @JoinColumn(name = "hotel_hotel_ID", referencedColumnName = "hotel_ID")
    private int hotelId;

    @ManyToOne
    @JoinColumn(name = "booking_date_ID", referencedColumnName = "date_ID")
    private int bookingDateId;

    @ManyToOne
    @JoinColumn(name = "chekin_date_ID", referencedColumnName = "date_ID")
    private int checkinDateId;

    @ManyToOne
    @JoinColumn(name = "checkout_date_ID", referencedColumnName = "date_ID")
    private int checkoutDateId;

    private char payment;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getBookingDateId() {
        return bookingDateId;
    }

    public void setBookingDateId(int bookingDateId) {
        this.bookingDateId = bookingDateId;
    }

    public int getCheckinDateId() {
        return checkinDateId;
    }

    public void setCheckinDateId(int checkinDateId) {
        this.checkinDateId = checkinDateId;
    }

    public int getCheckoutDateId() {
        return checkoutDateId;
    }

    public void setCheckoutDateId(int checkoutDateId) {
        this.checkoutDateId = checkoutDateId;
    }

    public char getPayment() {
        return payment;
    }

    public void setPayment(char payment) {
        this.payment = payment;
    }
}
