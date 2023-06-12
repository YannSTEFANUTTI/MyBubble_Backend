package manager.mybubble.Bubble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BubbleRepository extends JpaRepository<Bubble, Long> {

}

