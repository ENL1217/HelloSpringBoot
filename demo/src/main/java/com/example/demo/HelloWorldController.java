package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    @GetMapping(value="/hello")
    public String getHelloWorldString() {
        return "Hello, World! This is a Spring Boot application.";
    }

}
