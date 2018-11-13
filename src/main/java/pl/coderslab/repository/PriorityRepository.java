package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {

}
