package service.impl;

import model.RoomUnavailability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomUnavailabilityRepository;
import service.RoomUnavailabilityService;

import java.util.List;

@Service
public class RoomUnavailabilityServiceImpl implements RoomUnavailabilityService {

    @Autowired
    private RoomUnavailabilityRepository roomUnavailabilityRepository;

    @Override
    public RoomUnavailability getByRoom_room_ID(int room_room_ID) {
        return roomUnavailabilityRepository.getByRoom_room_ID(room_room_ID);
    }

    @Override
    public List<RoomUnavailability> getByStart_date_IDAndEnd_date_ID(int start_date_ID, int end_date_ID) {
        return roomUnavailabilityRepository.getByStart_date_IDAndEnd_date_ID(start_date_ID, end_date_ID);
    }
}
