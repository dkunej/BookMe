package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Payment;
import com.bookme.BookMe.model.User;

/**
 * Created by Daniela on 12-Nov-17.
 */
public interface PaymentService {
    Payment getByUsers(User user);
}
