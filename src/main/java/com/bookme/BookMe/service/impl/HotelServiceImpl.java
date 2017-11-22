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
    public List<Hotel> getAllByCheckinStartDateIdAndCheckinEndDateId(int startDate, int endDate) {
        return hotelRepository.getAllByCheckinStartDateIdAndCheckinEndDateId(startDate, endDate);
    }

    @Override
    public List<Hotel> getAllByAddress_City(String city) {
        return hotelRepository.getAllByAddress_City(city);
    }

    @Override
    public List<Hotel> getAllByCheckinStartDateIdAndCheckinEndDateIdAndAddress_City(int startDate, int endDate, String city)
    {
        return hotelRepository.getAllByCheckinStartDateIdAndCheckinEndDateIdAndAddress_City(startDate,endDate,city);
    }

}
