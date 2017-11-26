package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.Date;
import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.model.Room;
import com.bookme.BookMe.repository.RoomRepository;
import com.bookme.BookMe.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
    public List<Room> getAllByHotelId(Hotel hotelID) {
        return roomRepository.getAllByHotelId(hotelID);
    }

    @Override
    public List<Room> getAllByPrice(double price) {
        return roomRepository.getAllByPrice(price);
    }

    @Override
    public Room findByRoomId(int roomId) {
        return roomRepository.findByRoomId(roomId);
    }


    @Override
    public List<Room> getAllByHotelIdNameAndAvailability(String hotelName, boolean isAvailable) {
        return roomRepository.getAllByHotelIdNameAndAvailability(hotelName, isAvailable);
    }

    @Override
    public List<Room> findAvailableRoomsinHotelByDate(@Param("checkIn") Date checkIn, @Param("checkOut") Date checkOut) {
        return roomRepository.findAvailableRoomsinHotelByDate(checkIn, checkOut);
    }

    @Override
    public List<Room> getAllByRoomId(int roomId){
        return roomRepository.getAllByRoomId(roomId);
    }
}
