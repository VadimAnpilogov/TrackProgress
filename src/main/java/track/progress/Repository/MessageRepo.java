package track.progress.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.message;


@Repository
public interface MessageRepo extends CrudRepository <message, Integer> {
    //List<message> findAllByOrderByDateAsc();
   // List<message> findAllByOrderByDateDesc();

}
