package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

    @GetMapping()
    public String greeting() {
        return "greeting";
    }
    @PostMapping
    public  String add(@RequestParam String fio, @RequestParam String group){
        return "main";
    }

}