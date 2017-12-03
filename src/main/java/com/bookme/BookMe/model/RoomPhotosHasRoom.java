package com.bookme.BookMe.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room_photos_has_room")
public class RoomPhotosHasRoom {

    @Id
    @Column(name = "room_photos_photo_ID", nullable = false)
    private int roomPhotosPhotoId;

    @Column(name = "room_room_ID", nullable = false)
    private int roomRoomId;

    public RoomPhotosHasRoom() {
    }

    public int getRoomPhotosPhotoId() {
        return roomPhotosPhotoId;
    }

    public void setRoomPhotosPhotoId(int roomPhotosPhotoId) {
        this.roomPhotosPhotoId = roomPhotosPhotoId;
    }

    public int getRoomRoomId() {
        return roomRoomId;
    }

    public void setRoomRoomId(int roomRoomId) {
        this.roomRoomId = roomRoomId;
    }
}
