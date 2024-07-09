package com.ormispring.day0709;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "굿굿베리굿");
        model.addAttribute("message", "안녕하세요. 오르미 5기입니다.");
        return "index";
    }
}
