package com.bookme.BookMe.model;

import javax.persistence.*;

@Entity
@Table(name = "room_photos")
public class RoomPhotos {

    @Id
    @Column(name = "photo_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photoID;

    @Column(name = "photo", nullable = false)
    private byte[] photo;

    public RoomPhotos() {
    }

    public RoomPhotos(int photo_ID, byte[] photo) {
        this.photoID = photo_ID;
        this.photo = photo;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
