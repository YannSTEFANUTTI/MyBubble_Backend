package manager.mybubble.RentBonus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RentBonusService {

    private final RentBonusRepository rentBonusRepository;


    public List<RentBonus> getAll() {
        return rentBonusRepository.findAll();

    }

    public RentBonus getById(Long id) {
        return rentBonusRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(("RentActivity"+ id + "not found")));

    }

    public RentBonus add(RentBonus rentBonus) {
        return rentBonusRepository.save(rentBonus);    }

    public RentBonus update(RentBonus rentBonus, Long id) {
        RentBonus foundRentBonus = (RentBonus) getById(id);
        return rentBonusRepository.save(foundRentBonus);

    }

    public void delete(Long id) {rentBonusRepository.deleteById(id);
    }
}
