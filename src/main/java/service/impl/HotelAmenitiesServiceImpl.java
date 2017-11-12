package service.impl;

import model.HotelAmenities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HotelAmenitiesRepository;
import service.HotelAmenitiesService;

import java.util.List;

@Service
public class HotelAmenitiesServiceImpl implements HotelAmenitiesService {

    @Autowired
    private HotelAmenitiesRepository hotelAmenitiesRepository;

    @Override
    public HotelAmenities getByHotelID(int hotelID) {
        return hotelAmenitiesRepository.getByHotelID(hotelID);
    }

    @Override
    public List<HotelAmenities> getByPool(int pool) {
        return hotelAmenitiesRepository.getByPool(pool);
    }
}