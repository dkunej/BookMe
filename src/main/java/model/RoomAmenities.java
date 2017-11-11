package model;

import javax.persistence.*;

@Entity
@Table(name = "ROOM_AMENITIES")
public class RoomAmenities {

    @Id
    @OneToOne
    @JoinColumn(name = "room", nullable = false)
    private Room roomId_fk;

    @Column(name = "crib")
    private int crib;

    @Column(name = "hairdryer")
    private int hairdryer;

    @Column(name = "kettle")
    private int kettle;

    @Column(name = "washing_machine")
    private int washingMachine;

    @Column(name = "microwave")
    private int microwave;

    @Column(name = "refrigerator")
    private int refrigerator;

    @Column(name = "tv")
    private int tv;

    @Column(name = "cable")
    private int cable;


    public RoomAmenities(Room roomId_fk, int crib, int hairdryer, int kettle, int washingMachine, int microwave, int refrigerator, int tv, int cable) {
        this.roomId_fk = roomId_fk;
        this.crib = crib;
        this.hairdryer = hairdryer;
        this.kettle = kettle;
        this.washingMachine = washingMachine;
        this.microwave = microwave;
        this.refrigerator = refrigerator;
        this.tv = tv;
        this.cable = cable;
    }

    public Room getRoomId_fk() {
        return roomId_fk;
    }

    public void setRoomId_fk(Room roomId_fk) {
        this.roomId_fk = roomId_fk;
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

    public int getMicrowave() {
        return microwave;
    }

    public void setMicrowave(int microwave) {
        this.microwave = microwave;
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
