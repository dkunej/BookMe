package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Date;
import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> getAllByAvailability(boolean isAvailable);

    List<Room> getAllByHotelId(Hotel hotelID);

    List<Room> getAllByPrice(double price);

    Room findByRoomId(int roomId);

    List<Room> getAllByHotelIdNameAndAvailability(String hotelName, boolean isAvailable);

    @Query("select r from Room r inner join Hotel h on r.hotelId = h.hotelId where r.roomId not in (SELECT ru.roomID from RoomUnavailability ru WHERE ru.startDateID = :checkIn and ru.endDateID = :checkOut)")
    List<Room> findAvailableRoomsinHotelByDate(@Param("checkIn") Date checkIn, @Param("checkOut") Date checkOut);


}
