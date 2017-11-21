package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.RoomAmenities;
import com.bookme.BookMe.repository.RoomAmenitiesRepository;
import com.bookme.BookMe.service.RoomAmenitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomAmenitiesServiceImpl implements RoomAmenitiesService {

    @Autowired
    private RoomAmenitiesRepository roomAmenitiesRepository;

    @Override
    public RoomAmenities getByAmenities_ID(int amenities_ID) {
        return roomAmenitiesRepository.getByAmenities_ID(amenities_ID);
    }

    @Override
    public List<RoomAmenities> getByCrib(int crib) {
        return roomAmenitiesRepository.getByCrib(crib);
    }
}