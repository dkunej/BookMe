package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.HotelAmenities;
import com.bookme.BookMe.repository.HotelAmenitiesRepository;
import com.bookme.BookMe.service.HotelAmenitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelAmenitiesServiceImpl implements HotelAmenitiesService {

    @Autowired
    private HotelAmenitiesRepository hotelAmenitiesRepository;

    @Override
    public List<HotelAmenities> getByPool(int pool) {
        return hotelAmenitiesRepository.getByPool(pool);
    }
}