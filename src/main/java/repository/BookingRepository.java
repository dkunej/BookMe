package repository;

import model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking getByUserId(int userID);

    List<Booking> getByCheckinDateIdAndAndCheckoutDateId(int checkIn, int checkOut);

}
