package youssef.com.gradlereactivemongorecipeapp.repositories;


import org.springframework.data.repository.CrudRepository;
import youssef.com.gradlereactivemongorecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
