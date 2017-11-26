package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.model.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllByAvailability(boolean isAvailable);

    List<Room> getAllByHotelId(Hotel hotelID);

    List<Room> getAllByPrice(double price);

    Room findByRoomId(int roomId);

    List<Room> getAllByHotelIdNameAndAvailability(String hotelName, boolean isAvailable);

    List<Room> getAllByRoomId(int roomId);
}
