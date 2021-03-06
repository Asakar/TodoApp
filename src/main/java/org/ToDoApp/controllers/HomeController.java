package org.ToDoApp.controllers;

import jdk.jfr.ContentType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

//    @GetMapping("home.html?userName=&password=")
//    public String homeLogin() {
//        return "home";
//    }

}
