package model;

import javax.persistence.*;

@Entity
@Table(name = "room_unavailability")
public class RoomUnavailability {

    @Id
    @Column(name = "unavailability_ID", nullable = false)
    private int unavailability_ID;

    @ManyToOne
    @JoinColumn(name = "room_room_ID", nullable = false)
    private int room_room_ID;

    @ManyToOne
    @JoinColumn(name = "start_date_ID", nullable = false)
    private int start_date_ID;

    @ManyToOne
    @JoinColumn(name = "end_date_ID", nullable = false)
    private int end_date_ID;

    public RoomUnavailability(int unavailability_ID, int room_room_ID, int start_date_ID, int end_date_ID) {
        this.unavailability_ID = unavailability_ID;
        this.room_room_ID = room_room_ID;
        this.start_date_ID = start_date_ID;
        this.end_date_ID = end_date_ID;
    }

    public int getUnavailability_ID() {
        return unavailability_ID;
    }

    public void setUnavailability_ID(int unavailability_ID) {
        this.unavailability_ID = unavailability_ID;
    }

    public int getRoom_room_ID() {
        return room_room_ID;
    }

    public void setRoom_room_ID(int room_room_ID) {
        this.room_room_ID = room_room_ID;
    }

    public int getStart_date_ID() {
        return start_date_ID;
    }

    public void setStart_date_ID(int start_date_ID) {
        this.start_date_ID = start_date_ID;
    }

    public int getEnd_date_ID() {
        return end_date_ID;
    }

    public void setEnd_date_ID(int end_date_ID) {
        this.end_date_ID = end_date_ID;
    }
}