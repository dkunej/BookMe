package service;

import model.Booking;

import java.util.List;

public interface BookingService {

    Booking getByUserId(int userID);

    List<Booking> getByCheckinDateIdAndAndCheckoutDateId(int checkIn, int checkOut);
}
