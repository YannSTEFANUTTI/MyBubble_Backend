package manager.mybubble.Bubble;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bubble")
public class BubbleController {

    private final BubbleService bubbleService;

    public BubbleController(BubbleService bubbleService) {
        this.bubbleService = bubbleService;
    }

    @GetMapping
    public List<Bubble> getAll() {return bubbleService.getAll();
    }
    @GetMapping("/{id}")
    public Bubble getById(@PathVariable("id") Long id) {
        return bubbleService.getById(id);
    }


    @PostMapping("/add")
    public Bubble add(@RequestBody Bubble bubble) {
        return bubbleService.add(bubble);
    }


    @PutMapping("/update/{id}")
    public Bubble update(@RequestBody Bubble bubble, @PathVariable("id") Long id) {
        return bubbleService.update(bubble, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        bubbleService.delete(id);
    }
}