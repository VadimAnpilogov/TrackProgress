package track.progress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import track.progress.Repository.HomeworkRepository;

@Service
public class HomeworkService implements HomeworkServices{

    private HomeworkRepository repository;

    @Autowired
    public void setProductRepository(HomeworkRepository repository) {
        this.repository = repository;
    }



    @Override
    public void deleteH(Integer id) {
        repository.deleteById(id);
    }

}