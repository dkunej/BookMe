package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getByHotelName(String name);

    List<Hotel> getAllByAddressCityAndStars(String city, int stars);
}
