package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM_AMENITIES")
public class RoomAmenities {

    @Id
    @Column(name = "room_room_id", nullable = false)
    private int roomID;

    @Column(name = "crib")
    private int crib;

    @Column(name = "hairdryer")
    private int hairdryer;

    @Column(name = "kettle")
    private int kettle;

    @Column(name = "washing_machine")
    private int washingMachine;

    @Column(name = "refrigerator")
    private int refrigerator;

    @Column(name = "tv")
    private int tv;

    @Column(name = "cable")
    private int cable;

    public RoomAmenities(int roomID, int crib, int hairdryer, int kettle, int washingMachine, int refrigerator, int tv, int cable) {
        this.roomID = roomID;
        this.crib = crib;
        this.hairdryer = hairdryer;
        this.kettle = kettle;
        this.washingMachine = washingMachine;
        this.refrigerator = refrigerator;
        this.tv = tv;
        this.cable = cable;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getCrib() {
        return crib;
    }

    public void setCrib(int crib) {
        this.crib = crib;
    }

    public int getHairdryer() {
        return hairdryer;
    }

    public void setHairdryer(int hairdryer) {
        this.hairdryer = hairdryer;
    }

    public int getKettle() {
        return kettle;
    }

    public void setKettle(int kettle) {
        this.kettle = kettle;
    }

    public int getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(int washingMachine) {
        this.washingMachine = washingMachine;
    }

    public int getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(int refrigerator) {
        this.refrigerator = refrigerator;
    }

    public int getTv() {
        return tv;
    }

    public void setTv(int tv) {
        this.tv = tv;
    }

    public int getCable() {
        return cable;
    }

    public void setCable(int cable) {
        this.cable = cable;
    }
}
