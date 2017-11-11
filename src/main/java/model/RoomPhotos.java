package model;

import javax.persistence.*;

@Entity
@Table
public class RoomPhotos {

    @Id
    @Column(name = "photo_ID", nullable = false)
    private int photo_ID;

    @Column(name = "photo", nullable = false)
    private byte[] photo;

    public RoomPhotos(int photo_ID, byte[] photo) {
        this.photo_ID = photo_ID;
        this.photo = photo;
    }

    public int getPhoto_ID() {
        return photo_ID;
    }

    public void setPhoto_ID(int photo_ID) {
        this.photo_ID = photo_ID;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
