package com.bookme.BookMe.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Daniela on 11-Nov-17.
 */
@Entity
@Table(name = "DATE")
public class Date {

    @Id
    @Column(name = "date_ID", nullable = false)
    private int dateId;

    @Column(name = "year")
    private int year;

    @Column(name = "month")
    private int month;

    @Column(name = "day")
    private int day;

    @Column(name = "hour")
    private int hour;

    @OneToMany(mappedBy = "checkoutDateId")
    private List<Booking> bookingsbyCheckOutStart;

    @OneToMany(mappedBy = "checkinDateId")
    private List<Booking> bookingsbyCheckInStart;

    @OneToMany(mappedBy = "bookingDateId")
    private List<Booking> bookingsbyBookingDate;

    public Date() {
    }

    public Date(int checkOutYear, int checkOutDay, int checkOutMonth) {
        year = checkOutYear;
        day = checkOutDay;
        month = checkOutMonth;
    }

    public Date(int id, int checkInYear, int checkInDay, int checkInMonth) {
        dateId = id;
        year = checkInYear;
        day = checkInDay;
        month = checkInMonth;
    }

    @Override
    public String toString() {
        return "Date{" +
                "dateId=" + dateId +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                ", bookingsbyCheckOutStart=" + bookingsbyCheckOutStart +
                ", bookingsbyCheckInStart=" + bookingsbyCheckInStart +
                ", bookingsbyBookingDate=" + bookingsbyBookingDate +
                '}';
    }

    public int getDateId() {
        return dateId;
    }

    public void setDateId(int dateId) {
        this.dateId = dateId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

}