package track.progress.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.classes;

@Repository
public interface ClassesRepository extends CrudRepository<classes, Integer> {
}

