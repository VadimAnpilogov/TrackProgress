package track.progress.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Entity.homework;
import track.progress.Repository.HomeworkRepository;

import java.util.Date;
import java.util.Map;

@Controller
public class HomeworkController {

    public String Groups1="asc";
    public String Date1="asc";
    @Autowired
    public HomeworkRepository homeworkRepository;


    @GetMapping("homework")
    public String homework (Map<String, Object> model) {
        Iterable<homework> homework1 = homeworkRepository.findAllByOrderByDateDesc();
        model.put("homework", homework1);
        return "homework";
    }
    @GetMapping("homeworkG")
    public String redirHomework (Map<String, Object> model) {
        Iterable<homework> homework1 = homeworkRepository.findByGroups(Groups1);
        model.put("homework", homework1);
        return "homework";
    }
    @GetMapping("homeworkD")
    public String redirHomeworkDate (Map<String, Object> model) {
        Iterable<homework> homework1 = homeworkRepository.findByDate(Date1);
        model.put("homework", homework1);
        return "homework";
    }

    @GetMapping("FilterGroupsHomeWork/{groups}")
    public String FilterGroupsHomeWork (@PathVariable String groups, Map<String, Object> model) {
        Groups1=groups;
        Iterable<homework> homework1 = homeworkRepository.findByGroups(groups);
        model.put("homework", homework1);
        return "redirect:/homeworkG";
    }

    @PostMapping("addHomework")
    public String addHomework(@RequestParam String date, @RequestParam String description, @RequestParam String groups, Map<String, Object> model)
    {
        homework homework = new homework(date, description, groups);
        homeworkRepository.save(homework);

        Iterable<homework> homework1 = homeworkRepository.findAllByOrderByDateDesc();
        model.put("homework", homework1);
        return "homework";
    }
    @GetMapping("/deleteH/{id}")
    public String deleteHomework(@PathVariable Integer id) {
        homeworkRepository.deleteById(id);
        return "redirect:/homework";
    }


    @PostMapping("HWfilterSearchGroups")
    public String HWfilterSearchGroups(@RequestParam String groups, Map<String, Object> model){
        Groups1=groups;
        Iterable<homework> homework1 = homeworkRepository.findByGroups(groups);
        model.put("classhomeworkes", homework1);
        return "redirect:/homeworkG";
    }
    @PostMapping("HWfilterSearchDate")
    public String HWfilterSearchDate(@RequestParam String date, Map<String, Object> model){
        Date1=date;
        Iterable<homework> homework1 = homeworkRepository.findByDate(date);
        model.put("homework", homework1);
        return "redirect:/homeworkD";
    }


}
