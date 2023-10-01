package com.jsp.shoppingkart.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.jsp.shoppingkart.dao.MerchantDao;
import com.jsp.shoppingkart.dto.Merchant;
import com.jsp.shoppingkart.helper.AES;
import com.jsp.shoppingkart.helper.Loginhelper;
import com.jsp.shoppingkart.helper.SendmailLogic;

import jakarta.servlet.http.HttpSession;

@Service
public class MerchantService {

   @Autowired
   MerchantDao merchantDao;

   @Autowired
   SendmailLogic sendmailLogic;

   public String signUp(Merchant merchant, ModelMap map) {

      Merchant merchant1 = merchantDao.fetchByEmail(merchant.getEmail());
      Merchant merchant2 = merchantDao.fetchByMobile(merchant.getMobileno());

      if (merchant1 != null) {
         map.put("fail", "Email Already Exists");
         return "MerchantSignup";
      }
      if (merchant2 != null) {
         map.put("fail", "Mobile Number Already Exists");
         return "MerchantSignup";
      }
      merchant.setPwd(AES.encrypt(merchant.getPwd(), "123456"));
      int otp = new Random().nextInt(100000, 999999);
      merchant.setOtp(otp);
      // logic for sending otp..
      sendmailLogic.sendEmail(merchant);
      merchantDao.saveMerchant(merchant);
      map.put("pass", "OTP sent successfully");
      map.put("id", merchant.getId());
      return "MerchantVerifyOtp";
   }

   public String verify(int id, int otp, ModelMap map) {
      Merchant merchant = merchantDao.fetchById(id);
      if (merchant == null) {
         map.put("fail", "something went wrong");
         return "home";
      } else {
         if (merchant.getOtp() == otp) {
            merchant.setVerfied(true);
            merchantDao.saveMerchant(merchant);
            map.put("pass", "OTP verified successfully");
            return "MerchantLogin";
         } else {
            map.put("fail", "Invalid OTP");
            map.put("id", merchant.getId());
            return "MerchantVerifyOtp";
         }
      }
   }

   public String login(Loginhelper helper, ModelMap map, HttpSession session) {

          Merchant merchant =merchantDao.fetchByEmail(helper.getEmail());
          if(merchant==null)
          {
            map.put("fail", "Invalid Email");
            return "MerchantLogin";
          }else
          {
            if(AES.decrypt(merchant.getPwd(), "123456").equals(helper.getPwd()))
            {
               if(merchant.isVerfied())
               {
                  session.setAttribute("merchant", merchant);
                  map.put("pass", "login successful");
                  return "MerchantHome";
               }else
               {  
                  map.put("fail", "OTP not verified");
                  map.put("id", merchant.getId());
                  return "MerchantVerifyOtp";
               }
            }else{
               map.put("fail", "Invalid Password");
               return "MerchantLogin";
            }
          }
   }

}
