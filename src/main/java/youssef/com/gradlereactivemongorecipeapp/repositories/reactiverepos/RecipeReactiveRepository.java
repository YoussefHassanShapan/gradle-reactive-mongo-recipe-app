package youssef.com.gradlereactivemongorecipeapp.repositories.reactiverepos;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import youssef.com.gradlereactivemongorecipeapp.domain.Recipe;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {

}
