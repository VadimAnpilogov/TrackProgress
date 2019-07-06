package hello1.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ThemeController {

    @Autowired
    public ThemeRepository themeRepository;

    @GetMapping("theme")
    public String theme () {
        return "theme";
    }

    @PostMapping("addTheme")
    public String addTheme(@RequestParam String descriptionTheme)
    {
        theme theme = new theme(descriptionTheme);
        themeRepository.save(theme);

        return "theme";
    }

}
