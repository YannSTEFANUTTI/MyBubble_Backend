package manager.mybubble.RentActivities;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentActivitiesService {

    private final RentActivitiesRepository rentActivitiesRepository;

    public List<RentActivities> getAll() {
        return rentActivitiesRepository.findAll();
    }

    public RentActivities getById(Long id) {
        return rentActivitiesRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(("RentActivity"+ id + "not found")));
    }

    public RentActivities add(RentActivities rentActivities) {
        return rentActivitiesRepository.save(rentActivities);
    }

    public RentActivities update(RentActivities rentActivities, Long id) {
        RentActivities foundRentActivities = getById(id);
        return rentActivitiesRepository.save(foundRentActivities);
    }

    public void delete(Long id) {
        rentActivitiesRepository.deleteById(id);
    }
}
