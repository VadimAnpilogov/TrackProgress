package track.progress.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import track.progress.Entity.groupsL;
import track.progress.Entity.message;
import track.progress.Repository.GroupRepository;
import track.progress.Repository.MessageRepo;
import track.progress.service.GroupServices;


import java.util.Map;


@Controller
public class GreetingController {

    private GroupServices service;


    @Autowired
    public void setNoteService(GroupServices service) {
        this.service = service;
    }


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
        Iterable<message> messages = messageRepo.findAll();
        model.put("students", messages);


        return "students";
    }

    @PostMapping("addStudents")
    public String add(@RequestParam String fio, @RequestParam String groups,Map<String, Object> model)
    {
        message message1 = new message(fio,groups);
        messageRepo.save(message1);

        Iterable<message> messages = messageRepo.findAll();
        model.put("students", messages);
        return "students";
    }

    @GetMapping("/deleteG/{id}")
    public String deleteGroups(@PathVariable Integer id) {
        service.deleteG(id);
        return "redirect:/students";
    }
}