package com.spring_mvc.thymeleaf_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML from
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the HTML from
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworldprocess";
    }
}
