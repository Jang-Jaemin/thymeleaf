package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplataeController {

    @GetMapping("/fragment")
        public String template(){
            return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout")
    public String layout(){
        return "temple/layout/layoutMain";
    }
}
