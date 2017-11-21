package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.RoomUnavailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomUnavailabilityRepository extends JpaRepository<RoomUnavailability, Long> {

    RoomUnavailability getByRoom_room_ID(int room_room_ID);

    List<RoomUnavailability> getByStart_date_IDAndEnd_date_ID(int start_date_ID, int end_date_ID);
}