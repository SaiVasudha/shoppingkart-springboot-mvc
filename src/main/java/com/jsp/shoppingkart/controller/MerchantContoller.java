package com.jsp.shoppingkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/merchant")
public class MerchantContoller {
    
     @GetMapping("/login")
    public String loadMerchant()
    {
      return "MerchantLogin"; 
    }
    @GetMapping("/signup")
    public String merchantSignUp()
    {
      return "MerchantSignup";
    }
}
