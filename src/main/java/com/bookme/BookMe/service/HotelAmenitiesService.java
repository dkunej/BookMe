package com.bookme.BookMe.service;

import com.bookme.BookMe.model.HotelAmenities;

import java.util.List;

public interface HotelAmenitiesService {

    List<HotelAmenities> getByPool(int pool);
}