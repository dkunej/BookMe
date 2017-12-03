package com.bookme.BookMe.service;

import com.bookme.BookMe.model.RoomPhotos;

import java.util.List;

public interface RoomPhotosService {

    List<RoomPhotos> getRoomPhotosByRoomID(int roomId);
}
