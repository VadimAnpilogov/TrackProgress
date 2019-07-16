package track.progress.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import track.progress.Entity.message;
import track.progress.Repository.MessageRepo;
import java.util.Map;


@Controller
public class GreetingController {

    public String Groups1 = "ASC";

    @Autowired
    public MessageRepo messageRepo;

    @GetMapping
    public String main()
    {
        return "home";
    }

    @GetMapping("students")
    public String groups (Map<String, Object> model)
    {
        Iterable<message> messages = messageRepo.findByGroups(Groups1);
        model.put("students", messages);
        return "students";
    }

    @GetMapping("/FilterGroups/{groups}")
    public String FilterGroups(@PathVariable String groups, Map<String, Object> model) {

        Groups1=groups;
        Iterable<message> messages = messageRepo.findByGroups(Groups1);
        model.put("students", messages);
        return "redirect:/students";
    }

    @GetMapping("addStudents")
    public String add(@RequestParam String fio, Map<String, Object> model)
    {
        message message1 = new message(fio,Groups1);
        messageRepo.save(message1);



        Iterable<message> messages = messageRepo.findByGroups(Groups1);
        model.put("students", messages);
        return "redirect:/students";
    }

    @GetMapping("/deleteG/{id}")
    public String deleteGroups(@PathVariable Integer id) {
        messageRepo.deleteById(id);
        return "redirect:/students";
    }
}