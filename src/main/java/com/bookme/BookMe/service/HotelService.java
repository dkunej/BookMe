package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getAllByHotelName(String name);

    List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fk(int startDate, int endDate);

    List<Hotel> getAllByAddress_City(String address);

    List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fkAAndAddress_City(int startDate, int endDate, String city);
}
