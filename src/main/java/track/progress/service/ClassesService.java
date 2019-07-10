package track.progress.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import track.progress.Repository.ClassesRepository;


@Service
public class ClassesService implements ClassesServices{

    private ClassesRepository repository;

    @Autowired
    public void setProductRepository(ClassesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteC(Integer id) {
        repository.deleteById(id);
    }





}
