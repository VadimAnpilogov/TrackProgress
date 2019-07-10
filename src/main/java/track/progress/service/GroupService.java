package track.progress.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import track.progress.Repository.MessageRepo;

@Service
public class GroupService implements GroupServices {

    private MessageRepo repository;

    @Autowired
    public void setProductRepository(MessageRepo repository) {
        this.repository = repository;
    }



    @Override
    public void deleteG(Integer id) {
        repository.deleteById(id);
    }





}
