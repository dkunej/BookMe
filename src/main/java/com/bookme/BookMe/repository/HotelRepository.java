package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Address;
import com.bookme.BookMe.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> getByHotelName(String name);

    List<Hotel> getAllByCheckinStartDateIdAndCheckinEndDateId(int startDate, int endDate);

    List<Hotel> getAllByAddress_City(String city);

    List<Hotel> getAllByAddress(Address address);

    List<Hotel> getAllByCheckinStartDateIdAndCheckinEndDateIdAndAddress_City(int startDate, int endDate, String city);
}
