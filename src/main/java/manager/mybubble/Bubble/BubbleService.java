package manager.mybubble.Bubble;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BubbleService {

    private final BubbleRepository bubbleRepository;


    public Bubble getById(Long id) {
        return bubbleRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(("RentActivity"+ id + "not found")));    }


    public Bubble update(Bubble bubble, Long id) {
        Bubble foundBubble = (Bubble) getById(id);
        return bubbleRepository.save(foundBubble);
    }

    public void delete(Long id) {
        bubbleRepository.deleteById(id);
    }

    public List<Bubble> getAll() {return bubbleRepository.findAll();
    }

    public Bubble add(Bubble bubble) {return bubbleRepository.save(bubble);
    }
}