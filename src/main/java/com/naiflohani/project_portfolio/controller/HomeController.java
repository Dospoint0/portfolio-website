package com.naiflohani.project_portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home"; // This refers to the 'home.html' template in the 'templates' folder
    }
    @GetMapping("/foundry-tables")
    public String foundryTables() {
        return "foundry-tables"; // This refers to the 'foundry-tables.html' template
    }
}
