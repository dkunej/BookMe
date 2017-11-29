package com.bookme.BookMe.service;

import com.bookme.BookMe.model.PaymentMethod;
import com.bookme.BookMe.model.User;

/**
 * Created by Daniela on 12-Nov-17.
 */
public interface PaymentService {
    PaymentMethod getByUsers(User user);

    PaymentMethod getByPaymentName(String pmethod);
}
