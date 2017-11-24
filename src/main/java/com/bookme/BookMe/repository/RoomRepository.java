package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> getAllByAvailability(boolean isAvailable);

    List<Room> getAllByHotelId(Hotel hotelID);

    List<Room> getAllByPrice(double price);

    Room findByRoomId(int roomId);

    List<Room> getAllByAvailabilityAndPrice(boolean isAvailable, double price);
}
