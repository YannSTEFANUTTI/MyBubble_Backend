package manager.mybubble.RentActivities;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentactivities")
@RequiredArgsConstructor
public class RentActivitiesController {

    private final RentActivitiesService rentActivitiesService;


    @GetMapping
    public List<RentActivities> getAll() {
        return rentActivitiesService.getAll();
    }
    @GetMapping("/{id}")
    public RentActivities getById(@PathVariable("id") Long id) {return rentActivitiesService.getById(id);}


    @PostMapping("/add")
    public RentActivities add(@RequestBody RentActivities rentActivities) {
        return rentActivitiesService.add(rentActivities);
    }


    @PutMapping("/update/{id}")
    public RentActivities update(@RequestBody RentActivities rentActivities, @PathVariable("id") Long id) {
        return rentActivitiesService.update(rentActivities, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        rentActivitiesService.delete(id);
    }
}