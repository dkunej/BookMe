package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.RoomUnavailability;
import com.bookme.BookMe.repository.RoomUnavailabilityRepository;
import com.bookme.BookMe.service.RoomUnavailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomUnavailabilityServiceImpl implements RoomUnavailabilityService {

    @Autowired
    private RoomUnavailabilityRepository roomUnavailabilityRepository;

    @Override
    public RoomUnavailability getByRoomID(int room_room_ID) {
        return roomUnavailabilityRepository.getByRoomID(room_room_ID);
    }

    @Override
    public List<RoomUnavailability> getByStartDateIDAndEndDateID(int start_date_ID, int end_date_ID) {
        return roomUnavailabilityRepository.getByStartDateIDAndEndDateID(start_date_ID, end_date_ID);
    }
}
