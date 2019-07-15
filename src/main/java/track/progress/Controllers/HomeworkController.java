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



    @Autowired
    public HomeworkRepository homeworkRepository;


    @GetMapping("homework")
    public String homework (Map<String, Object> model) {
        Iterable<homework> homework1 = homeworkRepository.findAllByOrderByDateDesc();
        model.put("homework", homework1);
        return "homework";
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



}
