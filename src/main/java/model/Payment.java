package model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

public class Payment {
    @Id
    @Column(name = "PAYMENT_ID", nullable = false)
    private String paymentID;

    @Column(name = "NAME")
    private String paymentName;

    @Column(name = "CARD_NUMBER")
    private int cardNum;

    @OneToMany(mappedBy = "paymentMethod")
    private Set<User> users;

    public Payment(String paymentID, String paymentName, int cardNum, Set<User> users) {
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
