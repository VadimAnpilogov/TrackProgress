package track.progress.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import track.progress.Entity.groupsL;
import track.progress.Repository.GroupRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Controller

public class GroupController {
public String time;
    @Autowired

    public GroupRepository groupRepository;

    @GetMapping("groups")
    public String groups (Map<String, Object> model)
    {
        Iterable<groupsL> groups1 = groupRepository.findAllByOrderByTimeAsc();
        model.put("groupsL", groups1);


        return "groups";
    }

    @PostMapping("addGroups")
    public String add(@RequestParam String groups,Map<String, Object> model)
    {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        time = formatForDateNow.format(dateNow);


        groupsL groupsL1 = new groupsL(groups, time);
        groupRepository.save(groupsL1);

        Iterable<groupsL> groups1 = groupRepository.findAllByOrderByTimeAsc();
        model.put("groupsL", groups1);
        return "redirect:/groups";
    }

    @GetMapping("/deleteGL/{id}")
    public String deleteGroups(@PathVariable Integer id) {
        groupRepository.deleteById(id);
        return "redirect:/groups";
    }
}