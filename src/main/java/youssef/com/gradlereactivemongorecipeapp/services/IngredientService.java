package youssef.com.gradlereactivemongorecipeapp.services;


import reactor.core.publisher.Mono;
import youssef.com.gradlereactivemongorecipeapp.commands.IngredientCommand;

public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Void> deleteById(String recipeId, String idToDelete);
}
