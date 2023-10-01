package com.jsp.shoppingkart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.shoppingkart.dto.Merchant;
import com.jsp.shoppingkart.repository.MerchantRepository;

@Repository
public class MerchantDao {

    @Autowired
    MerchantRepository merchantRepository;

    public void saveMerchant(Merchant merchant) {
        merchantRepository.save(merchant);
    }

    public Merchant fetchByEmail(String email) {
        return merchantRepository.findByEmail(email);
    }

    public Merchant fetchByMobile(long mobileno) {
        return merchantRepository.findByMobileno(mobileno);
    }

    public Merchant fetchById(int id) {
        return merchantRepository.findById(id).orElse(null);
    }

}
