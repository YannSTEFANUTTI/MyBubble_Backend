package manager.mybubble.RentPictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RentPicturesRepository extends JpaRepository<RentPictures, Long> {

}

