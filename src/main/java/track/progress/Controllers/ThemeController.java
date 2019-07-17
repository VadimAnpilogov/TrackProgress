package track.progress.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import track.progress.Entity.theme;
import track.progress.Repository.ThemeRepository;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Controller
public class ThemeController {

public String time;
    @Autowired
    public ThemeRepository themeRepository;

    @GetMapping("theme")
    public String theme (Map<String, Object> model) {

        Iterable<theme> theme1 = themeRepository.findAllByOrderByTimeAsc();
        model.put("theme", theme1);
        return "theme";
    }

    @PostMapping("addTheme")
    public String addTheme(@RequestParam String descriptionTheme, Map<String, Object> model)
    {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        time = formatForDateNow.format(dateNow);

        theme theme = new theme(descriptionTheme, time);
        themeRepository.save(theme);

        Iterable<theme> theme1 = themeRepository.findAllByOrderByTimeAsc();
        model.put("theme", theme1);

        return "theme";
    }

    @GetMapping("/deleteT/{id}")
    public String deleteTheme(@PathVariable Integer id) {
        themeRepository.deleteById(id);
        return "redirect:/theme";
    }

}
