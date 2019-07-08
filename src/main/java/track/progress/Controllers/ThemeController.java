package track.progress.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Entity.theme;
import track.progress.Repository.ThemeRepository;

import java.util.Map;


@Controller
public class ThemeController {

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

}
