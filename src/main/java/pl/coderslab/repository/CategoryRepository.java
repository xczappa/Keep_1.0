package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
