package service;

import model.RoomPhotos;

import java.util.List;

public interface RoomPhotosService {

    RoomPhotos getByPhoto_ID(int photo_ID);

    List<RoomPhotos> getByPhoto(byte[] photo);
}
