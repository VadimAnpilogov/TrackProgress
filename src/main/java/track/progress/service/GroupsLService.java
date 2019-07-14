package track.progress.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import track.progress.Repository.GroupRepository;

@Service
public class GroupsLService implements GroupsLServices {

    private GroupRepository repository;

    @Autowired
    public void setProductRepository(GroupRepository repository) {
        this.repository = repository;
    }



    @Override
    public void deleteGL(Integer id) {
        repository.deleteById(id);
    }





}
