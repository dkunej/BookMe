package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Booking;

import java.util.List;

public interface BookingService {

    Booking getByUserId(int userID);

    List<Booking> getByCheckinDateIdAndAndCheckoutDateId(int checkIn, int checkOut);

    void save(Booking booking);
}