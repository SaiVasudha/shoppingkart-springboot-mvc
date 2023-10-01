package com.jsp.shoppingkart.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.jsp.shoppingkart.dto.Merchant;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class SendmailLogic {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendEmail(Merchant merchant) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo(merchant.getEmail());
            helper.setSubject("OTP verification");
            String text = "<h1>Hello " + merchant.getName() + "</h1><p>Your OTP is " + merchant.getOtp() + "</p>";
            helper.setText(text, true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
