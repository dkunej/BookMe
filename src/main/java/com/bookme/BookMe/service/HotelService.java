package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getByHotelName(String name);

    List<Hotel> getAllByCheckinStartDateIdAndCheckinEndDateId(int startDate, int endDate);

    List<Hotel> getAllByAddress_City(String address);

    List<Hotel> getAllByCheckinStartDateIdAndCheckinEndDateIdAndAddress_City(int startDate, int endDate, String city);
}
