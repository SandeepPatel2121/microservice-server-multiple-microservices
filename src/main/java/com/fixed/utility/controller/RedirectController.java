package com.fixed.utility.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {

    @RequestMapping("/")
    public String getName() {
        return "<h1>Welcome to Fixed Assets</h1>";
    }

}
