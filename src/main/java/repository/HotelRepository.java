package repository;

import model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> getAllByHotelName(String name);

    List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fk(int startDate, int endDate);


}
