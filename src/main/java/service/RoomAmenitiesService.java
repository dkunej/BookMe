package service;

import model.RoomAmenities;

import java.util.List;

public interface RoomAmenitiesService {

    RoomAmenities getByAmenities_ID(int amenities_ID);

    List<RoomAmenities> getByCrib(int crib);
}
