package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.RoomPhotos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomPhotosRepository extends JpaRepository<RoomPhotos, Long> {

    RoomPhotos getByPhotoID(int photo_ID);

    List<RoomPhotos> getByPhoto(byte photo[]);
}
