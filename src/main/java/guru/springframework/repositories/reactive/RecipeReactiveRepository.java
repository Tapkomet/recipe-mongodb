package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by Tapkomet on 5/28/2020
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {

}
