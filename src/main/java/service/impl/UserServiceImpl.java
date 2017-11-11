package service.impl;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

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
    public List<User> getAllByCountry(String country) {
        return userRepository.getAllByCountry(country);
    }

    @Override
    public User getByPassportNum(int passNum) {
        return userRepository.getByPassportNum(passNum);
    }
}
