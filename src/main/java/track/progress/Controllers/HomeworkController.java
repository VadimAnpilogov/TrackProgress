package track.progress.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Entity.homework;
import track.progress.Repository.HomeworkRepository;

import java.util.Map;

@Controller
public class HomeworkController {
    @Autowired
    public HomeworkRepository homeworkRepository;

    @GetMapping("homework")
    public String homework (Map<String, Object> model) {
        Iterable<homework> homework1 = homeworkRepository.findAll();
        model.put("homework", homework1);
        return "homework";
    }

    @PostMapping("addHomework")
    public String addHomework(@RequestParam String description, @RequestParam String groups, @RequestParam String date, Map<String, Object> model)
    {
        homework homework = new homework(description, groups, date);
        homeworkRepository.save(homework);

        Iterable<homework> homework1 = homeworkRepository.findAll();
        model.put("homework", homework1);
        return "homework";
    }
}
