package com.dmdev.springsecuritybasic.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeUser(){
        return "Welcome to Spring Application with Security!";
    }
}
