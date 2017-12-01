package com.bookme.BookMe.model;

import javax.persistence.*;

@Entity
@Table(name = "room_unavailability")
public class RoomUnavailability {

    @Id
    @Column(name = "unavailability_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unavailabilityID;

    @ManyToOne
    @JoinColumn(name = "room_room_ID", nullable = false)
    private Room roomID;

    @ManyToOne
    @JoinColumn(name = "start_date_ID", nullable = false)
    private Date startDateID;

    @ManyToOne
    @JoinColumn(name = "end_date_ID", nullable = false)
    private Date endDateID;

    public RoomUnavailability() {
    }

    public RoomUnavailability(int unavailability_ID, Room room_room_ID, Date start_date_ID, Date end_date_ID) {
        this.unavailabilityID = unavailability_ID;
        this.roomID = room_room_ID;
        this.startDateID = start_date_ID;
        this.endDateID = end_date_ID;
    }

    public RoomUnavailability(Room roomId, Date checkInDate, Date checkOutDate) {
        this.roomID = roomId;
        this.startDateID = checkInDate;
        this.endDateID = checkOutDate;
    }

    public Room getRoomID() {
        return roomID;
    }

    public void setRoomID(Room roomID) {
        this.roomID = roomID;
    }

    public Date getStartDateID() {
        return startDateID;
    }

    public void setStartDateID(Date startDateID) {
        this.startDateID = startDateID;
    }

    public Date getEndDateID() {
        return endDateID;
    }

    public void setEndDateID(Date endDateID) {
        this.endDateID = endDateID;
    }

    public int getUnavailabilityID() {
        return unavailabilityID;
    }

    public void setUnavailabilityID(int unavailabilityID) {
        this.unavailabilityID = unavailabilityID;
    }


}