package com.example.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String homePage() {
        return "Hello World.";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World bor";
    }
}
