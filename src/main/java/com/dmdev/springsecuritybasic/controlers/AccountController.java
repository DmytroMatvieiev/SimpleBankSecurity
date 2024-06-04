package com.dmdev.springsecuritybasic.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String getAccountDetails(){
        return "Here lies your account knowledge";
    }
}
