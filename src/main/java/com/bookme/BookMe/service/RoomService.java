package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Date;
import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.model.Room;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoomService {
    List<Room> getAllByAvailability(boolean isAvailable);

    List<Room> getAllByHotelId(Hotel hotelID);

    List<Room> getAllByPrice(double price);

    Room findByRoomId(int roomId);

    List<Room> getAllByHotelIdNameAndAvailability(String hotelName, boolean isAvailable);

    List<Room> findAvailableRoomsinHotelByDate(@Param("checkIn") Date checkIn, @Param("checkOut") Date checkOut);

    List<Room> getAllByRoomId(int roomId);
}
