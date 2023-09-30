package com.jsp.shoppingkart.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.jsp.shoppingkart.dao.MerchantDao;
import com.jsp.shoppingkart.dto.Merchant;
import com.jsp.shoppingkart.helper.AES;

@Service
public class MerchantService {

    @Autowired
    MerchantDao merchantDao;

    public String signUp(Merchant merchant, ModelMap map) {
        
      Merchant merchant1=merchantDao.fetchByEmail(merchant.getEmail());
      Merchant merchant2=merchantDao.fetchByMobile(merchant.getMobileno());
     
          if(merchant1!=null)
          {
           map.put("fail","Email Already Exists");
           return "MerchantSignUp";
        }
          if(merchant2!=null)
          {
             map.put("fail","Mobile Number Already Exists");
             return "MerchantSignup";
          }
          merchant.setPwd(AES.encrypt(merchant.getPwd(),"123456"));
          int otp=new Random().nextInt(100000,999999);
          merchant.setOtp(otp);
          //logic for sending otp..
           merchantDao.saveMerchant(merchant);
           map.put("success","email sent successfully");
           return "MerchantVerifyOtp";
        }
    
}
