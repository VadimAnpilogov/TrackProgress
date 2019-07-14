package track.progress.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import track.progress.Entity.groupsL;
import track.progress.Entity.message;
import track.progress.Repository.GroupRepository;
import track.progress.Repository.MessageRepo;
import track.progress.service.GroupServices;
import track.progress.service.GroupsLServices;

import java.util.Map;


@Controller
//@RestController
public class GroupController {

    private GroupsLServices service;


    @Autowired
    public void setNoteService(GroupsLServices service) {
        this.service = service;
    }


    @Autowired
    public GroupRepository groupRepository;

    @GetMapping("groups")
    public String groups (Map<String, Object> model)
    {
        Iterable<groupsL> groups1 = groupRepository.findAll();
        model.put("groupsL", groups1);


        return "groups";
    }

    @PostMapping("addGroups")
    public String add(@RequestParam String groups,Map<String, Object> model)
    {
        groupsL groupsL1 = new groupsL(groups);
        groupRepository.save(groupsL1);

        Iterable<groupsL> groups1 = groupRepository.findAll();
        model.put("groupsL", groups1);
        return "redirect:/groups";
    }

    @GetMapping("/deleteGL/{id}")
    public String deleteGroups(@PathVariable Integer id) {
        service.deleteGL(id);
        return "redirect:/groups";
    }
}