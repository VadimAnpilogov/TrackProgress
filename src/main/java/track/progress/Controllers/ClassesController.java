package track.progress.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Repository.ClassesRepository;
import track.progress.Entity.classes;
import track.progress.service.ClassesServices;

import java.util.Map;

@Controller
public class ClassesController {

    private ClassesServices service;


    @Autowired
    public void setNoteService(ClassesServices service) {
        this.service = service;
    }


    @Autowired
    public ClassesRepository classesRepository;

    @GetMapping("classes")
    public String classes (Map<String, Object> model) {
        Iterable<classes> classes1 = classesRepository.findAll();
        model.put("classes", classes1);
        return "classes";
    }

    @PostMapping("addClasses")
    public String addClasses(@RequestParam String date, @RequestParam String groups, Map<String, Object> model)
    {
        classes classes = new classes(date, groups);
        classesRepository.save(classes);

        Iterable<classes> classes1 = classesRepository.findAll();
        model.put("classes", classes1);
        return "classes";
    }
    @GetMapping("/deleteC/{id}")
    public String deleteClasses(@PathVariable Integer id) {
        service.deleteC(id);
        return "redirect:/classes";
    }

}