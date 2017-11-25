package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Hotel getByName(String name);

    List<Hotel> getAllByAddressCityAndStars(String city, int stars);
}
