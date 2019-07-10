package track.progress.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Entity.theme;
import track.progress.Repository.ThemeRepository;
import track.progress.service.ThemeServices;

import java.util.Map;


@Controller
public class ThemeController {


    private ThemeServices service;


    @Autowired
    public void setNoteService(ThemeServices service) {
        this.service = service;
    }


    @Autowired
    public ThemeRepository themeRepository;

    @GetMapping("theme")
    public String theme (Map<String, Object> model) {
        Iterable<theme> theme1 = themeRepository.findAll();
        model.put("theme", theme1);
        return "theme";
    }

    @PostMapping("addTheme")
    public String addTheme(@RequestParam String descriptionTheme, Map<String, Object> model)
    {
        theme theme = new theme(descriptionTheme);
        themeRepository.save(theme);

        Iterable<theme> theme1 = themeRepository.findAll();
        model.put("theme", theme1);

        return "theme";
    }

    @GetMapping("/deleteT/{id}")
    public String deleteTheme(@PathVariable Integer id) {
        service.deleteT(id);
        return "redirect:/theme";
    }

}
