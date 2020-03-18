package guru.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndeController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String showIndex() {
        return "index";
    }
}
