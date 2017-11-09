package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Daniela on 09-Nov-17.
 */

@Entity
@Table(name = "HOTEL")
public class Hotel {

    @Id
    @Column(name = "hotel_ID")
    private int hotelId;

    @Column(name = "checkin_start_date_ID")
    private int checkinStartDateId_fk;

    @Column(name = "checkin_end_date_ID")
    private int checkinEndDateId_fk;

    @Column(name = "checkout_start_date_ID_fk")
    private int checkoutStartDateId_fk;

    @Column(name = "checkout_end_date_ID_fk")
    private int checkoutEndDateId_fk;

    @Column(name = "name")
    private String hotelName;

    @Column(name = "description")
    private String hotelDescription;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getCheckinStartDateId_fk() {
        return checkinStartDateId_fk;
    }

    public void setCheckinStartDateId_fk(int checkinStartDateId_fk) {
        this.checkinStartDateId_fk = checkinStartDateId_fk;
    }

    public int getCheckinEndDateId_fk() {
        return checkinEndDateId_fk;
    }

    public void setCheckinEndDateId_fk(int checkinEndDateId_fk) {
        this.checkinEndDateId_fk = checkinEndDateId_fk;
    }

    public int getCheckoutStartDateId_fk() {
        return checkoutStartDateId_fk;
    }

    public void setCheckoutStartDateId_fk(int checkoutStartDateId_fk) {
        this.checkoutStartDateId_fk = checkoutStartDateId_fk;
    }

    public int getCheckoutEndDateId_fk() {
        return checkoutEndDateId_fk;
    }

    public void setCheckoutEndDateId_fk(int checkoutEndDateId_fk) {
        this.checkoutEndDateId_fk = checkoutEndDateId_fk;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }
}
