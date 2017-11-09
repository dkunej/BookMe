package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @Column(name = "USER_ID", nullable = false)
    private int userID;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "EMAIL")
    private String email;

    public User(String firstName, String lastName, String country, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.email = email;
    }

//------------Getters and setters ------------------

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
}
