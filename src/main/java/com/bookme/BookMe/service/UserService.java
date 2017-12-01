package com.bookme.BookMe.service;

import com.bookme.BookMe.model.User;

import java.util.List;

public interface UserService {
    User getByFirstNameAndLastName(String fName, String lname);

    List<User> getAllByCountryAbbr(String country);

    User getByPassportNum(int num);

    void save(User user);
}