package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PAYMENT_METHOD")
public class PaymentMethod {
    @Id
    @Column(name = "PAYMENT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String paymentID;

    @Column(name = "NAME")
    private String paymentName;

    @Column(name = "CARD_NUMBER")
    private int cardNum;

    @OneToMany(mappedBy = "paymentMethod")
    private List<User> users;

    public PaymentMethod() {
    }

    public PaymentMethod(String paymentID, String paymentName, int cardNum, List<User> users) {
        this.paymentID = paymentID;
        this.paymentName = paymentName;
        this.cardNum = cardNum;
        this.users = users;
    }
    //-----Getters and Setters ------------------

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
