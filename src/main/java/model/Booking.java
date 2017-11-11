package model;

import javax.persistence.*;

/**
 * Created by Daniela on 11-Nov-17.
 */

@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @Column(name = "bookingId")
    private int bookingId;


    @ManyToOne
    @JoinColumn(name = "user_user_ID", referencedColumnName = "user_ID")
    private int userId;

    @ManyToOne
    @JoinColumn(name = "hotel_hotel_ID", referencedColumnName = "hotel_ID")
    private int hotelId;

    @ManyToOne
    @JoinColumn(name = "booking_date_ID", referencedColumnName = "date_ID")
    private int bookingDateId;

    @ManyToOne
    @JoinColumn(name = "chekin_date_ID", referencedColumnName = "date_ID")
    private int checkinDateId;

    @ManyToOne
    @JoinColumn(name = "checkout_date_ID", referencedColumnName = "date_ID")
    private int checkoutDateId;

    private char payment;


}
