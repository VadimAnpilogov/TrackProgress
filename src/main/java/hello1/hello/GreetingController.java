package hello1.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Controller
//@RestController
public class GreetingController {

    @Autowired
    public MessageRepo messageRepo;

//    @GetMapping
//    public String home() {
//        return "home";
//    }
    @GetMapping
    public String main(Map<String, Object> model)
    {
        Iterable<message> messages = messageRepo.findAll();

        model.put("messages", messages);
        return "home";
    }

    @GetMapping("groups")
    public String groups () {
        return "groups";
    }

    @PostMapping("filter")
    public String add(@RequestParam String fio, @RequestParam String group2,Map<String, Object> model)
    {
        message message = new message(fio,group2);
        messageRepo.save(message);
        Iterable<message> messages = messageRepo.findAll();

        model.put("messages", messages);
        return "home";
    }

}