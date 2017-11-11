package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getByFirstNameAndLastName(String fName, String lname);

    List<User> getAllByCountry(String country);

    User getByPassportNum(int passNum);

}
