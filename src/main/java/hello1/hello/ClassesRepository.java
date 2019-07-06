package hello1.hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends CrudRepository<classes, Integer> {
}

