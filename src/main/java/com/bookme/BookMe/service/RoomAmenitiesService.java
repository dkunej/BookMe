package com.bookme.BookMe.service;

import com.bookme.BookMe.model.RoomAmenities;

import java.util.List;

public interface RoomAmenitiesService {

    RoomAmenities getByAmenitiesID(int amenities_ID);

    List<RoomAmenities> getByCrib(int crib);
}
