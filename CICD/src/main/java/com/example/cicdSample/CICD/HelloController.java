package com.example.cicdSample.CICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to your Spring Boot application deployed on Tomcat!";
    }

}
