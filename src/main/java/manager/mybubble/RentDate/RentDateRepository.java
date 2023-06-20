package manager.mybubble.RentDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RentDateRepository extends JpaRepository<RentDate, Long> {

    public List<RentDate> findByResidentId(Long id);

}
