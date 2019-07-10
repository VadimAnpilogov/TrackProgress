package track.progress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import track.progress.Repository.ThemeRepository;

@Service
public class ThemeService implements ThemeServices{

    private ThemeRepository repository;

    @Autowired
    public void setProductRepository(ThemeRepository repository) {
        this.repository = repository;
    }



    @Override
    public void deleteT(Integer id) {
        repository.deleteById(id);
    }

}