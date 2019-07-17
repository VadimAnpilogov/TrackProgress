package track.progress.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.groupsL;
import track.progress.Entity.message;
import track.progress.Entity.theme;

import java.util.List;


@Repository
public interface GroupRepository extends CrudRepository <groupsL, Integer> {
    List<groupsL> findAllByOrderByTimeAsc();

}
