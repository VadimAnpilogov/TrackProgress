package track.progress.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Entity.finishedThemes;
import track.progress.Entity.theme;
import track.progress.Repository.FinishedThemesRepository;
import track.progress.Repository.ThemeRepository;

import java.util.Map;

@Controller
public class FinishedThemesController {

    public String Groups1 = "ASC";
    public String Theme1 = "ASC";

    @Autowired
    public FinishedThemesRepository finishedThemesRepository;

//    @Autowired
//    public ThemeRepository themeRepository;


    @GetMapping("finishedThemes")
    public String finishedThemes (Map<String, Object> model) {
        Iterable<finishedThemes> finishedThemes = finishedThemesRepository.findAll();
        model.put("finishedThemes2", finishedThemes);
        return "finishedThemes";
    }

    @PostMapping("addFinishThemes")
    public String addClasses(@RequestParam String theme, @RequestParam String groups, Map<String, Object> model)
    {
        finishedThemes finishedThemes1 = new finishedThemes(theme, groups);
        finishedThemesRepository.save(finishedThemes1);

        Iterable<finishedThemes> finishedThemes2 = finishedThemesRepository.findAll();
        model.put("finishedThemes2", finishedThemes2);
        return "finishedThemes";
    }


    @GetMapping("/deleteF/{id}")
    public String deleteF(@PathVariable Integer id) {
        finishedThemesRepository.deleteById(id);
        return "redirect:/finishedThemes";
    }


}
