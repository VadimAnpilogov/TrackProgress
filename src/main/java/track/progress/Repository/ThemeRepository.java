package track.progress.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.theme;


@Repository
public interface ThemeRepository extends CrudRepository<theme, Integer> {
}
