package com.bookme.BookMe.service;

import com.bookme.BookMe.model.RoomUnavailability;

import java.util.List;

public interface RoomUnavailabilityService {

    RoomUnavailability getByRoomID(int room_room_ID);

    List<RoomUnavailability> getByStartDateIDAndEndDateID(int start_date_ID, int end_date_ID);

    RoomUnavailability save(RoomUnavailability ru);

}