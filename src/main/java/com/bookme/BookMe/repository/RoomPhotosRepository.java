package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.RoomPhotos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomPhotosRepository extends JpaRepository<RoomPhotos, Long> {

    @Query("SELECT rp from RoomPhotos rp LEFT JOIN RoomPhotosHasRoom rphr ON rp.photoID = rphr.roomPhotosPhotoId LEFT JOIN Room r on rphr.roomRoomId = r.roomId WHERE rphr.roomRoomId = :roomId")
    List<RoomPhotos> getRoomPhotosByRoomID(@Param("roomId") int roomId);

}
