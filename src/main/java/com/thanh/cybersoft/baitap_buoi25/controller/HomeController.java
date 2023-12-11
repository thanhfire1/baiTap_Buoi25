package com.thanh.cybersoft.baitap_buoi25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("*")
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/welcome")
    public String welcome(@ModelAttribute ("username") String username, Model model) {
        model.addAttribute("username", username);
        return "welcome";
    }

}
