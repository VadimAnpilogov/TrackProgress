package track.progress.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.classes;
import track.progress.Entity.homework;

import java.util.List;


@Repository
public interface ClassesRepository extends CrudRepository<classes, Integer> {
    List<classes> findByDate(String Date);
    List<classes> findAllByOrderByDateDesc();
    List<classes> findByGroups(String groups);

}

