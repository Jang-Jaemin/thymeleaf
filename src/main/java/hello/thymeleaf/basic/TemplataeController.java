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

    //템플릿 레이아웃 1
    @GetMapping("/layout")
    public String layout(){
        return "temple/layout/layoutMain";
    }

    //템플릿 레이아웃 2
    @GetMapping("/layoutExtend")
    public String layoutExtends(){
        return "temple/layoutExtend/layoutExtendMain";
    }
}
