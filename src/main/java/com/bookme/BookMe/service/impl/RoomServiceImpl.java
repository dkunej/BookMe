package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.Room;
import com.bookme.BookMe.repository.RoomRepository;
import com.bookme.BookMe.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;


    @Override
    public List<Room> getAllByAvailability(boolean isAvailable) {
        return roomRepository.getAllByAvailability(isAvailable);
    }

    @Override
    public List<Room> getAllByHotelId(int hotelID) {
        return roomRepository.getAllByHotelId(hotelID);
    }

    @Override
    public List<Room> getAllByPrice(double price) {
        return roomRepository.getAllByPrice(price);
    }

    @Override
    public List<Room> getAllByAvailabilityAndPrice(boolean isAvailable, double price) {
        return roomRepository.getAllByAvailabilityAndPrice(isAvailable, price);
    }
}
