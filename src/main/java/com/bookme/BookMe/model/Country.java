package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @Column(name = "COUNTRY_ABBR", nullable = false)
    private String countryAbbr;

    @Column(name = "NAME")
    private String countryName;

    @OneToMany(mappedBy = "countryAbbr")
    private Set<User> users;

    @OneToMany(mappedBy = "countryAbbr")
    private Set<Address> addresses;

    public Country(String countryAbbr, String countryName, Set<User> users) {
        this.countryAbbr = countryAbbr;
        this.countryName = countryName;
        this.users = users;
    }

    //--------- Getters and setter--------------------

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public String getCountryAbbr() {
        return countryAbbr;
    }

    public void setCountryAbbr(String countryAbbr) {
        this.countryAbbr = countryAbbr;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
