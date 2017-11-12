package service.impl;

import model.RoomPhotos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoomPhotosRepository;
import service.RoomPhotosService;

import java.util.List;

@Service
public class RoomPhotosImpl implements RoomPhotosService {

    @Autowired
    private RoomPhotosRepository roomPhotosRepository;

    @Override
    public RoomPhotos getByPhoto_ID(int photo_ID) {
        return roomPhotosRepository.getByPhoto_ID(photo_ID);
    }

    @Override
    public List<RoomPhotos> getByPhoto(byte[] photo) {
        return roomPhotosRepository.getByPhoto(photo);
    }
}