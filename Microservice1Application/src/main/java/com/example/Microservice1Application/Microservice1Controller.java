package com.example.Microservice1Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice1Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Microservice 1!";
    }
}