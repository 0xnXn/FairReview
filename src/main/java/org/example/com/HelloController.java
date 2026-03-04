package org.example.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        // Return the view name (without .html). Spring's view resolver will map this to templates/index.html
        return "index";
    }

}