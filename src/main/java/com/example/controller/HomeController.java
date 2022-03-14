package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bakhromjon Mon, 12:05 PM 3/14/2022
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "Welcome Home Page";
    }
}
