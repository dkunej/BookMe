package service;

import model.HotelAmenities;

import java.util.List;

public interface HotelAmenitiesService {

    HotelAmenities getByHotelID(int hotelID);

    List<HotelAmenities> getByPool(int pool);
}