package manager.mybubble.RentDate;
import manager.mybubble.User.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentdate")
public class RentDateController {

    private final RentDateService rentDateService;

    public RentDateController(RentDateService rentDateService) {
        this.rentDateService = rentDateService;
    }

    @GetMapping
    public List<RentDate> getAll() {
        return rentDateService.getAll();
    }

    @GetMapping("/{id}")
    public RentDate getById(@PathVariable("id") Long id) {
        return rentDateService.getById(id);
    }

    @GetMapping("/user/{id}")
    public List<RentDate> getByResidentId(@PathVariable("id") Long id) { return (List<RentDate>) rentDateService.getByResidentId(id); }

    @PostMapping("/add")
    public RentDate add(@RequestBody RentDate rentDate) {
        return rentDateService.add(rentDate);
    }

    @PutMapping("/update/{id}")
    public RentDate update(@RequestBody RentDate rentDate, @PathVariable("id") Long id) {
        return rentDateService.update(rentDate, id);}

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        rentDateService.delete(id);
    }
}
