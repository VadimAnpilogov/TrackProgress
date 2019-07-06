package hello1.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClassesController {

    @Autowired
    public ClassesRepository classesRepository;

    @GetMapping("classes")
    public String classes () {
        return "classes";
    }

    @PostMapping("addClasses")
    public String addClasses(@RequestParam String date, @RequestParam String groups)
    {
        classes classes = new classes(date, groups);
        classesRepository.save(classes);

        return "classes";
    }

}