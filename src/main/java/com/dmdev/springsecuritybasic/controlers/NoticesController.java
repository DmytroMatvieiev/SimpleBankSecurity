package com.dmdev.springsecuritybasic.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

     @GetMapping("/notice")
    public String getNotices(){
         return " You have new letter, oh no, it`s a thread";
     }
}
