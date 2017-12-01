package com.bookme.BookMe.model;

import javax.persistence.*;

/**
 * Created by Daniela on 11-Nov-17.
 */

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @Column(name = "address_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private int zip;

    @ManyToOne
    @JoinColumn(name = "country_abbr", nullable = false)
    private Country countryAbbr;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Hotel hotel;

    public Address() {
    }

    public Address(int addressId, String streetAddress, String city, int zip, Country countryAbbr, Hotel hotelId) {
        this.addressId = addressId;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zip = zip;
        this.countryAbbr = countryAbbr;
        this.hotel = hotelId;
    }

    public Address(int id) {
        addressId = id;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public Country getCountryAbbr() {
        return countryAbbr;
    }

    public void setCountryAbbr(Country countryAbbr) {
        this.countryAbbr = countryAbbr;
    }

    public Hotel getHotelId() {
        return hotel;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotel = hotelId;
    }
}
