package hello1.hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeworkController {
    @Autowired
    public HomeworkRepository homeworkRepository;

    @GetMapping("homework")
    public String homework () {
        return "homework";
    }

    @PostMapping("addHomework")
    public String addHomework(@RequestParam String description, @RequestParam String groups, @RequestParam String date)
    {
        homework homework = new homework(description, groups, date);
        homeworkRepository.save(homework);

        return "homework";
    }
}
