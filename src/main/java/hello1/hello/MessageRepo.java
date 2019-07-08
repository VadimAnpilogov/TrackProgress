package hello1.hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MessageRepo extends CrudRepository <message, Integer> {
    //List<message> findAllByOrderByDateAsc();
   // List<message> findAllByOrderByDateDesc();

}
