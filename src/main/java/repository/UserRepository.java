package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getByFirstName(String fName);

    List<User> getAllByCountry();

    User getByPassportNum();

}
