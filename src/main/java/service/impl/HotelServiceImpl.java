package service.impl;

import model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import repository.HotelRepository;
import service.HotelService;

import java.util.List;

public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllByHotelName(String name) {
        return hotelRepository.getAllByHotelName(name);
    }

    @Override
    public List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fk(int startDate, int endDate) {
        return hotelRepository.getAllByCheckinStartDateId_fkAndCheckinEndDateId_fk(startDate, endDate);
    }
}
