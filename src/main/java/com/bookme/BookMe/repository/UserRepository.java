package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {

    User getByFirstNameAndLastName(String fName, String lname);

    List<User> getAllByCountryAbbr(String country);

    User getByPassportNum(int passNum);

}
