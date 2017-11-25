package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.repository.HotelRepository;
import com.bookme.BookMe.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getByHotelName(String name) {
        return hotelRepository.getByHotelName(name);
    }


    @Override
    public List<Hotel> getAllByAddressCityAndStars(String city, int stars) {
        return hotelRepository.getAllByAddressCityAndStars(city, stars);
    }

}
