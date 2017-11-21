package com.bookme.BookMe.service;

import com.bookme.BookMe.model.RoomUnavailability;

import java.util.List;

public interface RoomUnavailabilityService {

    RoomUnavailability getByRoom_room_ID(int room_room_ID);

    List<RoomUnavailability> getByStart_date_IDAndEnd_date_ID(int start_date_ID, int end_date_ID);
}