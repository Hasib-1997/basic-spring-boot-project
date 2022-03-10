package spring.hasib.first;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryHasib extends CrudRepository<ModelHasib, Integer> {
}