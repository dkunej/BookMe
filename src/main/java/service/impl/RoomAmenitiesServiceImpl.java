package service.impl;

import model.RoomAmenities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomAmenitiesRepository;
import service.RoomAmenitiesService;

import java.util.List;

@Service
public class RoomAmenitiesServiceImpl implements RoomAmenitiesService {

    @Autowired
    private RoomAmenitiesRepository roomAmenitiesRepository;

    @Override
    public RoomAmenities getByRoomId_fk(int roomId_fk) {
        return roomAmenitiesRepository.getByRoomId_fk(roomId_fk);
    }

    @Override
    public List<RoomAmenities> getByCrib(int crib) {
        return roomAmenitiesRepository.getByCrib(crib);
    }
}