package repository;

import model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> getAllByHotelName(String name);

    List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fk(int startDate, int endDate);

    List<Hotel> getAllByAddress_City(String city);

    List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fkAAndAddress_City(int startDate, int endDate, String city);
}