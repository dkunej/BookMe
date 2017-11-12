package service.impl;

import model.Payment;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PaymentRepository;
import service.PaymentService;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment getByUsers(User user) {
        return paymentRepository.getByUsers(user);
    }
}
