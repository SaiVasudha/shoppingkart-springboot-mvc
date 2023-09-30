package com.jsp.shoppingkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminContoller {
    @GetMapping("/login")
    public String loadAdmin()
    {
        return "AdminLogin";
    }

    @GetMapping("/home")
    public String adminHome()
    {
       return "AdminHome";
    }
}
