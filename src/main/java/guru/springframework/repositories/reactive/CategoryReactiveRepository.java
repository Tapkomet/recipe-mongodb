package guru.springframework.repositories.reactive;

import guru.springframework.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * Created by Tapkomet on 5/28/2020
 */
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    Mono<Category> findByDescription(String desc);

}
