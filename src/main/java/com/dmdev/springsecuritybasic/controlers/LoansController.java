package com.dmdev.springsecuritybasic.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetails(){
        return "You own your soul to the bank";
    }
}
