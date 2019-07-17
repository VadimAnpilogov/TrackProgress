package track.progress.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.classes;
import track.progress.Entity.theme;

import java.util.List;


@Repository
public interface ThemeRepository extends CrudRepository<theme, Integer> {
    List<theme> findAllByOrderByTimeAsc();
}
