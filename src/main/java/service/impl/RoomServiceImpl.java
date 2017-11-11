package service.impl;

import model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomRepository;
import service.RoomService;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;


    @Override
    public List<Room> getAllByAvailability(boolean isAvailable) {
        return roomRepository.getAllByAvailability(isAvailable);
    }

    @Override
    public List<Room> getAllByHotelId_fk(int hotelID) {
        return roomRepository.getAllByHotelId_fk(hotelID);
    }

    @Override
    public List<Room> getAllByPrice(double price) {
        return roomRepository.getAllByPrice(price);
    }

    @Override
    public List<Room> getAllByAvailabilityAndPrice(boolean isAvailable, double price) {
        return roomRepository.getAllByAvailabilityAndPrice(isAvailable, price);
    }
}
