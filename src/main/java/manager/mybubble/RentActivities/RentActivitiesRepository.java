package manager.mybubble.RentActivities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentActivitiesRepository extends JpaRepository<RentActivities, Long> {

}
