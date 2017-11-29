package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.User;
import com.bookme.BookMe.repository.UserRepository;
import com.bookme.BookMe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getByFirstNameAndLastName(String fName, String lname) {
        return userRepository.getByFirstNameAndLastName(fName, lname);
    }

    @Override
    public List<User> getAllByCountryAbbr(String country) {
        return userRepository.getAllByCountryAbbr(country);
    }

    @Override
    public User getByPassportNum(int passNum) {
        return userRepository.getByPassportNum(passNum);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
