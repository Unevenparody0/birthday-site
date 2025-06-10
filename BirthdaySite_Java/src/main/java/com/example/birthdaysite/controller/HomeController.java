package com.example.birthdaysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showBirthdayPage(Model model) {
        model.addAttribute("name", "Niharika");
        model.addAttribute("message", "Wishing you the happiest birthday filled with love, laughter, and magic!");
        return "birthday";
    }
}
