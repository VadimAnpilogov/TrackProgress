package track.progress.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.homework;

@Repository
public interface HomeworkRepository extends CrudRepository<homework, Integer> {
}
