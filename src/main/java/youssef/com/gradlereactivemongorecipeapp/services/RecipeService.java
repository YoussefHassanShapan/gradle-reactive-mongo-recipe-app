package youssef.com.gradlereactivemongorecipeapp.services;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import youssef.com.gradlereactivemongorecipeapp.commands.RecipeCommand;
import youssef.com.gradlereactivemongorecipeapp.domain.Recipe;

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand>  saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);
}
