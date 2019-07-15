package track.progress.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import track.progress.Entity.finishedThemes;

@Repository
public interface FinishedThemesRepository extends CrudRepository<finishedThemes, Integer> {

}
