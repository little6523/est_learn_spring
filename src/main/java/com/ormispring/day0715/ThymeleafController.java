package com.ormispring.day0715;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class ThymeleafController {

  @GetMapping("/index")
  public String index(@RequestParam("name") String name, Model model) {
    User max = new User("max", "max@gmail.com", true);


    model.addAttribute("user", max);

    return "index";
  }
}
