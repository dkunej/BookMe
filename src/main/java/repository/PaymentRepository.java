package repository;

import model.Payment;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment getByUsers(User user);
}