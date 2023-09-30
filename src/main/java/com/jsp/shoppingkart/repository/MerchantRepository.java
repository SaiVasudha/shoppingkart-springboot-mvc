package com.jsp.shoppingkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shoppingkart.dto.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant,Integer>{

    Merchant findByEmail(String email);

    Merchant findByMobileno(long mobileno);
    
}
