package manager.mybubble.RentPictures;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentPicturesService {

    private final RentPicturesRepository rentPicturesRepository;

    public List<RentPictures> getAll() {
        return rentPicturesRepository.findAll();    }

    public RentPictures getById(Long id) {
        return rentPicturesRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(("RentPictures"+ id + "not found")));
    }

    public RentPictures add(RentPictures rentPictures) {
        return rentPicturesRepository.save(rentPictures);
    }

    public RentPictures update(RentPictures rentPictures, Long id) {
        RentPictures foundRentPictures = getById(id);
        return rentPicturesRepository.save(foundRentPictures);
    }

    public void delete(Long id) {rentPicturesRepository.deleteById(id);
    }
}
