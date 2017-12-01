package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @Column(name = "USER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TITLE")
    private String title;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ABBR", nullable = false)
    private Country countryAbbr;

    @Column(name = "PASSPORT_NUM")
    private int passportNum;

    @Column(name = "ID_NUM")
    private int IDNum;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_METHOD", nullable = false)
    private PaymentMethod paymentMethod;

    @OneToMany(mappedBy = "userId")
    private List<Booking> bookings;


    public User() {
    }

    public User(int userID, String firstName, String lastName, String email, Country countryAbbr, int passportNum, int IDNum, PaymentMethod paymentMethod, String title) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.countryAbbr = countryAbbr;
        this.passportNum = passportNum;
        this.IDNum = IDNum;
        this.paymentMethod = paymentMethod;
        this.title = title;
    }

    public User(String firstName, String lastName, String email, Country countryAbbr, int passportNum, int IDNum, PaymentMethod paymentMethod, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.countryAbbr = countryAbbr;
        this.passportNum = passportNum;
        this.IDNum = IDNum;
        this.paymentMethod = paymentMethod;
        this.title = title;
    }

//------------Getters and setters ------------------


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Country getCountryAbbr() {
        return countryAbbr;
    }

    public void setCountryAbbr(Country countryAbbr) {
        this.countryAbbr = countryAbbr;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public int getIDNum() {
        return IDNum;
    }

    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethodMethod) {
        this.paymentMethod = paymentMethodMethod;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
