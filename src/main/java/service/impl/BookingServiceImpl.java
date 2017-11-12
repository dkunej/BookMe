package service.impl;

import model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookingRepository;
import service.BookingService;

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
}
