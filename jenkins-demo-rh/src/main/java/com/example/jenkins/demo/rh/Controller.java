package com.example.jenkins.demo.rh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String msg(){
        return "App is running";
    }
}
