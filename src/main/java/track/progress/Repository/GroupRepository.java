package track.progress.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.groupsL;
import track.progress.Entity.message;


@Repository
public interface GroupRepository extends CrudRepository <groupsL, Integer> {


}
