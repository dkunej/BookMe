package repository;

import model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
