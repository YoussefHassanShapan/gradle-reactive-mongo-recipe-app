package youssef.com.gradlereactivemongorecipeapp.repositories;


import org.springframework.data.repository.CrudRepository;
import youssef.com.gradlereactivemongorecipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);
}
