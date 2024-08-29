package youssef.com.gradlereactivemongorecipeapp.repositories;


import org.springframework.data.repository.CrudRepository;
import youssef.com.gradlereactivemongorecipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
