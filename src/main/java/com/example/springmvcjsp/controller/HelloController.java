package com.example.springmvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestGetMapping("/")
public class HelloController {
    @GetMapping("/greeting")
    public String greet(Model model) { // 일종의 의존성 주입
        // key, value
        model.addAttribute("username", "김영인");
        model.addAttribute("message", "9월에는 공휴일이 없어요 ㅠㅠ");
        return "greet";
        // web-app/WEB-INF/views/ + {...} + .jsp
    }
}
