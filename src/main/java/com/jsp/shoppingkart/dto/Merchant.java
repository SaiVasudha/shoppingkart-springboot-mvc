package com.jsp.shoppingkart.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Component
public class Merchant {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int Id;
       private String  name;
       private String email ;
       private long mobileno;
       private LocalDate dob;
       private String pwd;
       private int otp;
       private boolean verfied;
}
