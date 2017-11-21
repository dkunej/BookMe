package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.HotelAmenities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelAmenitiesRepository extends JpaRepository<HotelAmenities, Long> {

    HotelAmenities getByHotelID(int hotelID);

    List<HotelAmenities> getByPool(int pool);
}