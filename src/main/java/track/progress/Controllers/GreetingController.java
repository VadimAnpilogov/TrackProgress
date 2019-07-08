package track.progress.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import track.progress.Entity.message;
import track.progress.Repository.MessageRepo;

import java.util.Map;


@Controller
//@RestController
public class GreetingController {

    @Autowired
    public MessageRepo messageRepo;
   // private String sortDateMethod = "ASC";

//    @GetMapping
//    public String list(Model model)
//    {
//        List<message> notebook = filterAndSort();
//
//        return "home";
//    }

    @GetMapping
    public String main()
    {
        return "home";
    }


    @GetMapping("groups")
    public String groups (Map<String, Object> model)
    {
        Iterable<message> messages = messageRepo.findAll();
        model.put("groups", messages);
        return "groups";
    }

    @PostMapping("addStudents")
    public String add(@RequestParam String fio, @RequestParam String groups,Map<String, Object> model)
    {
        message message1 = new message(fio,groups);
        messageRepo.save(message1);

        Iterable<message> messages = messageRepo.findAll();
        model.put("groups", messages);
        return "groups";
    }

}