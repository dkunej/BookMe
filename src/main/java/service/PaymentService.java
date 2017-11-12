package service;

import model.Payment;
import model.User;

/**
 * Created by Daniela on 12-Nov-17.
 */
public interface PaymentService {
    Payment getByUsers(User user);
}
