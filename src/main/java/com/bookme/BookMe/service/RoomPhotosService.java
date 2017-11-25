package com.bookme.BookMe.service;

import com.bookme.BookMe.model.RoomPhotos;

import java.util.List;

public interface RoomPhotosService {

    RoomPhotos getByPhotoID(int photo_ID);

    List<RoomPhotos> getByPhoto(byte[] photo);
}
