package model;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @Column(name = "USER_ID", nullable = false)
    private int userID;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "COUNTRY", nullable = false)
    private Country countryAbbr;

    @Column(name = "PASSPORT_NUM")
    private int passportNum;

    @Column(name = "ID_NUM")
    private int IDNum;

    @ManyToOne
    @JoinColumn(name = "PAYMENT_ID", nullable = false)
    private String paymentMethod;

    @OneToMany(mappedBy = "userId")
    private Booking bookings;

    public Booking getBookings() {
        return bookings;
    }

    public void setBookings(Booking bookings) {
        this.bookings = bookings;
    }

    public User() {
    }


//------------Getters and setters ------------------


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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
