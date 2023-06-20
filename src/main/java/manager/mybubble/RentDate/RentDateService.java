package manager.mybubble.RentDate;
import lombok.RequiredArgsConstructor;
import manager.mybubble.User.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RentDateService {

    private final RentDateRepository rentDateRepository;

    public List<RentDate> getAll() {
        return rentDateRepository.findAll();    }

    public RentDate getById(Long id) {
        return rentDateRepository.findById(id).orElseThrow(()-> new RuntimeException(("Rent dates"+ id + "not found")));
    }

    public List<RentDate> getByResidentId(Long id) {
        return rentDateRepository.findByResidentId(id);
    }


    public RentDate add(RentDate rentDate) {
        return rentDateRepository.save(rentDate);
    }

    public RentDate update(RentDate rentDate, Long id) {
        RentDate foundRendate = getById(id);
        return rentDateRepository.save(foundRendate);
    }

    public void delete(Long id) {rentDateRepository.deleteById(id);
    }


}
