package hello1.hello;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ThemeRepository extends CrudRepository<theme, Integer> {
}
