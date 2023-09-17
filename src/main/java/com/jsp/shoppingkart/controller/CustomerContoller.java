package com.jsp.shoppingkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    @RequestMapping("/customer")
public class CustomerContoller {
  
    @GetMapping("/login")
    public String loadCustomer()
    {
        return "CustomerLogin";
    }

    @GetMapping("/signup")
    public String customerSignup()
    {
        return "CustomerSignup";
    }
    
}
