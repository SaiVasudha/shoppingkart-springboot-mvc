package com.jsp.shoppingkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.shoppingkart.dto.Merchant;
import com.jsp.shoppingkart.service.MerchantService;

@Controller
@RequestMapping("/merchant")
public class MerchantContoller {

  @Autowired
  MerchantService merchantService;
    
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

    @GetMapping("/home")
    public String merchantHome()
    {
      return "MerchantHome";
    }

    @PostMapping("/signup")
    @ResponseBody
    public String signUp(Merchant merchant,ModelMap map)
    {
      return merchantService.signUp(merchant,map);
    }
}
