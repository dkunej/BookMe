package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.PaymentMethod;
import com.bookme.BookMe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Repository
public interface PaymentRepository extends JpaRepository<PaymentMethod, Long> {
    PaymentMethod getByUsers(User user);

    PaymentMethod getByPaymentName(String pmethod);
}
