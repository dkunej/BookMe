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
    public RoomAmenities getByAmenities_ID(int amenities_ID) {
        return roomAmenitiesRepository.getByAmenities_ID(amenities_ID);
    }

    @Override
    public List<RoomAmenities> getByCrib(int crib) {
        return roomAmenitiesRepository.getByCrib(crib);
    }
}