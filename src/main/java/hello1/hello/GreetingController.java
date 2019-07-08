package hello1.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


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