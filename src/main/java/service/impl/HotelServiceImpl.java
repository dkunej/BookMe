package service.impl;

import model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HotelRepository;
import service.HotelService;

import java.util.List;

@Service
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

    @Override
    public List<Hotel> getAllByAddress_City(String city) {
        return hotelRepository.getAllByAddress_City(city);
    }

    @Override
    public List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fkAAndAddress_City(int startDate, int endDate, String city)
    {
        return hotelRepository.getAllByCheckinStartDateId_fkAndCheckinEndDateId_fkAAndAddress_City(startDate,endDate,city);
    }

}
