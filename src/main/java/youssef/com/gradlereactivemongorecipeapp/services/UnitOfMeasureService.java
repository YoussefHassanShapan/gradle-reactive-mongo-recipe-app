package youssef.com.gradlereactivemongorecipeapp.services;


import reactor.core.publisher.Flux;
import youssef.com.gradlereactivemongorecipeapp.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
