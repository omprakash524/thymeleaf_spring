package com.spring_mvc.thymeleaf_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("thedata", java.time.LocalDateTime.now());

        return "helloworld";
    }
}
