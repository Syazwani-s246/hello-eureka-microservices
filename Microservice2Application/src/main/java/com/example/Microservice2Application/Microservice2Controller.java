package com.example.Microservice2Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice2Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Microservice 2!";
    }
}
