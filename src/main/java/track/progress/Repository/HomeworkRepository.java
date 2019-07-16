package track.progress.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.homework;

import java.util.List;

@Repository
public interface HomeworkRepository extends CrudRepository<homework, Integer> {
    List<homework> findAllByOrderByDateDesc();
    List<homework> findByGroups(String groups);
    List<homework> findByDate(String date);

}
