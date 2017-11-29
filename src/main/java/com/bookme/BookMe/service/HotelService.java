package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel getByName(String name);

    List<Hotel> getAllByAddressCityAndStars(String city, int stars);

    Hotel getByHotelId(int id);
}
