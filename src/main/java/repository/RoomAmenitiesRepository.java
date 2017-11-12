package repository;

import model.RoomAmenities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomAmenitiesRepository extends JpaRepository<RoomAmenities, Long> {

    RoomAmenities getByAmenities_ID(int amenities_ID);

    List<RoomAmenities> getByCrib(int crib);
}
