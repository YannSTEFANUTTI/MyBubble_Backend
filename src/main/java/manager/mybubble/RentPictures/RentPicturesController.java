package manager.mybubble.RentPictures;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentpictures")
public class RentPicturesController {

    private final RentPicturesService rentPicturesService;

    public RentPicturesController(RentPicturesService rentPicturesService) {
        this.rentPicturesService = rentPicturesService;
    }

    @GetMapping
    public List<RentPictures> getAll() {
        return rentPicturesService.getAll();
    }
    @GetMapping("/{id}")
    public RentPictures getById(@PathVariable("id") Long id) {return rentPicturesService.getById(id);
    }


    @PostMapping("/add")
    public RentPictures add(@RequestBody RentPictures rentPictures) {return rentPicturesService.add(rentPictures);
    }


    @PutMapping("/update/{id}")
    public RentPictures update(@RequestBody RentPictures rentPictures, @PathVariable("id") Long id) {
        return rentPicturesService.update(rentPictures, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        rentPicturesService.delete(id);
    }
}
