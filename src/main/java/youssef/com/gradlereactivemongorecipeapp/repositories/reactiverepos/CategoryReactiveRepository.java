package youssef.com.gradlereactivemongorecipeapp.repositories.reactiverepos;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import youssef.com.gradlereactivemongorecipeapp.domain.Category;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    Mono<Category> findByDescription(String description);
}
