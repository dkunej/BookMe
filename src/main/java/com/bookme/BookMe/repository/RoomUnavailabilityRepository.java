package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.RoomUnavailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomUnavailabilityRepository extends JpaRepository<RoomUnavailability, Long> {

    RoomUnavailability getByRoomID(int room_room_ID);

    List<RoomUnavailability> getByStartDateIDAndEndDateID(int start_date_ID, int end_date_ID);
}