package com.bookme.BookMe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room_photos")
public class RoomPhotos {

    @Id
    @Column(name = "photo_ID", nullable = false)
    private int photoID;

    @Column(name = "photo", nullable = false)
    private byte[] photo;

    public RoomPhotos() {
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
