package repository;

import model.RoomPhotos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomPhotosRepository extends JpaRepository<RoomPhotos, Long> {

    RoomPhotos getByPhoto_ID(int photo_ID);

    List<RoomPhotos> getByPhoto(byte photo[]);
}
