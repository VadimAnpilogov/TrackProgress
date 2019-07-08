//package hello1.hello;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class GroupsServiceImpl {
//
//    private MessageRepo repository;
//
//    @Autowired
//    public void setProductRepository(MessageRepo repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public message getNoteById(Integer id) {
//        return repository.findOne(id);
//    }
//
//
//
//
//
//
//
//
//
//
//    @Override
//    public List<message> findAllByOrderByDateDesc() {
//        return repository.findAllByOrderByDateDesc();
//    }
//}
