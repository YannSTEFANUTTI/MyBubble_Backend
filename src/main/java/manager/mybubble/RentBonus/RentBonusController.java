package manager.mybubble.RentBonus;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentbonus")
public class RentBonusController {

    private final RentBonusService rentBonusService;

    public RentBonusController(RentBonusService rentBonusService) {
        this.rentBonusService = rentBonusService;
    }

    @GetMapping
    public List<RentBonus> getAll() {
        return rentBonusService.getAll();
    }
    @GetMapping("/{id}")
    public RentBonus getById(@PathVariable("id") Long id) {
        return rentBonusService.getById(id);
    }


    @PostMapping("/add")
    public RentBonus add(@RequestBody RentBonus rentBonus) {
        return rentBonusService.add(rentBonus);
    }


    @PutMapping("/update/{id}")
    public RentBonus update(@RequestBody RentBonus bubble, @PathVariable("id") Long id) {
        return rentBonusService.update(bubble, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        rentBonusService.delete(id);
    }
}
