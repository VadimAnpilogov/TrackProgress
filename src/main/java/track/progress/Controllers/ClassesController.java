package track.progress.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Repository.ClassesRepository;
import track.progress.Entity.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class ClassesController {


    public String Groups1="asc";
    public String Date1="asc";

    @Autowired
    public ClassesRepository classesRepository;

    @GetMapping
    public String main(Map<String, Object> model) {

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM/dd/yyyy");

        Iterable<classes> classes1 = classesRepository.findByDate(formatForDateNow.format(dateNow));
        model.put("classes", classes1);
        return "home";
    }

    @GetMapping("classes")
    public String classes (Map<String, Object> model) {
        Iterable<classes> classes1 = classesRepository.findAllByOrderByDateDesc();
        model.put("classes", classes1);
        return "classes";
    }

    @GetMapping("classesG")
    public String redirClasses (Map<String, Object> model) {
        Iterable<classes> classes1 = classesRepository.findByGroups(Groups1);
        model.put("classes", classes1);
        return "classes";
    }
    @GetMapping("classesD")
    public String redirClassesDate (Map<String, Object> model) {
        Iterable<classes> classes1 = classesRepository.findByDate(Date1);
        model.put("classes", classes1);
        return "classes";
    }

    @GetMapping("FilterGroupsClasses/{groups}")
    public String FilterGroupsClasses (@PathVariable String groups, Map<String, Object> model) {
        Groups1=groups;
        Iterable<classes> classes1 = classesRepository.findByGroups(groups);
        model.put("classes", classes1);
        return "redirect:/classesG";
    }
    @GetMapping("home")
    public String home (Map<String, Object> model) {

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM/dd/yyyy");

        Iterable<classes> classes1 = classesRepository.findByDate(formatForDateNow.format(dateNow));
        model.put("classes", classes1);
        return "home";
    }
    @PostMapping("addClasses")
    public String addClasses(@RequestParam String date, @RequestParam String groups, Map<String, Object> model)
    {
        if((date.isEmpty())||(groups.isEmpty()))
        {
            return "404";
        }
        classes classes = new classes(date, groups);
        classesRepository.save(classes);

        Iterable<classes> classes1 = classesRepository.findAllByOrderByDateDesc();
        model.put("classes", classes1);
        return "classes";
    }
    @GetMapping("/deleteC/{id}")
    public String deleteClasses(@PathVariable Integer id) {
        classesRepository.deleteById(id);
        return "redirect:/classes";
    }

    @PostMapping("filterSearchGroups")
    public String filterSearchGroups(@RequestParam String groups, Map<String, Object> model){
        if(groups.isEmpty())
        {
            return "404";
        }
        Groups1=groups;
        Iterable<classes> classes1 = classesRepository.findByGroups(groups);
        model.put("classes", classes1);
        return "redirect:/classesG";
    }
    @PostMapping("filterSearchDate")
    public String filterSearchDate(@RequestParam String date, Map<String, Object> model){
        if(date.isEmpty())
        {
            return "404";
        }
        Date1=date;
        Iterable<classes> classes1 = classesRepository.findByDate(date);
        model.put("classes", classes1);
        return "redirect:/classesD";
    }


}