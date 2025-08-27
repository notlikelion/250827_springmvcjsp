package com.example.springmvcjsp.controller;

import com.example.springmvcjsp.model.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 애너테이션
public class UserController {
    @GetMapping("/join")
    public String joinPage() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String processJoin(@ModelAttribute User user,
                              Model model) {
        System.out.println(user.userId());
        System.out.println(user.password());
        model.addAttribute("userID", user.userId());
        return "joinResult";
    }

    @GetMapping("/login") // browser 접속
    public String loginPage() {
        return "loginForm";
    }

    @PostMapping("/login")
    public String processLogin(
            // required=true
            @RequestParam("userId") String id,
            @RequestParam("password") String pw,
            // required=false 필수가 아님 -> 안들어가면 null
            @RequestParam(value = "saveId", required = false, defaultValue = "N") String saveId,
            Model model
    ) {
        System.out.println("ID : %s".formatted(id));
        System.out.println("PW : %s".formatted(pw));
        System.out.println("Save ID : %s".formatted(saveId));
        model.addAttribute("userID", id);
        return "loginResult";
    }
}
