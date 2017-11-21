package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllByAvailability(boolean isAvailable);

    List<Room> getAllByHotelId(int hotelID);

    List<Room> getAllByPrice(double price);

    List<Room> getAllByAvailabilityAndPrice(boolean isAvailable, double price);
}
