package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, CrudRepository<Booking, Long> {

    Booking getByUserId(int userID);

    List<Booking> getByCheckinDateIdAndAndCheckoutDateId(int checkIn, int checkOut);

}
