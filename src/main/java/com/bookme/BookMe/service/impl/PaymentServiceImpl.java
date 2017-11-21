package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.PaymentMethod;
import com.bookme.BookMe.model.User;
import com.bookme.BookMe.repository.PaymentRepository;
import com.bookme.BookMe.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentMethod getByUsers(User user) {
        return paymentRepository.getByUsers(user);
    }
}
