package com.example.springmvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestGetMapping("/")
public class HelloController {
    @GetMapping("/greeting")
    public String greet() {
        return "greet";
        // web-app/WEB-INF/views/ + {...} + .jsp
    }
}
