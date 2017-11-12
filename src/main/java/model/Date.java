package model;

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

    @Column(name = "minute")
    private int minute;

    @Column(name = "seconds")
    private int seconds;

    @OneToMany(mappedBy = "checkoutDateId")
    private List<Booking> bookingsbyCheckOut;

    @OneToMany(mappedBy = "checkinDateId")
    private List<Booking> bookingsbyCheckIn;

    @OneToMany(mappedBy = "bookingDateId")
    private List<Booking> bookingsbyBookingDate;



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

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
