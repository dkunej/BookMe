package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.Booking;
import com.bookme.BookMe.repository.BookingRepository;
import com.bookme.BookMe.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking getByUserId(int userID) {
        return bookingRepository.getByUserId(userID);
    }

    @Override
    public List<Booking> getByCheckinDateIdAndAndCheckoutDateId(int checkIn, int checkOut) {
        return bookingRepository.getByCheckinDateIdAndAndCheckoutDateId(checkIn, checkOut);
    }

    @Override
    public void save(Booking booking) {
        bookingRepository.save(booking);
    }
}
