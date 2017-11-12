package service;

import model.RoomAmenities;

import java.util.List;

public interface RoomAmenitiesService {

    RoomAmenities getByRoomId_fk(int roomId_fk);

    List<RoomAmenities> getByCrib(int crib);
}
