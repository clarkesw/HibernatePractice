package com.coupon.services;

import com.coupon.models.Coupon;
import com.coupon.repositories.CouponRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    @Autowired
    CouponRepository repo;
    
    public void saveCoupon(Coupon coupon) {
        repo.save(coupon);
    }  
    
    public List<Coupon> getCoupons() {
        return repo.findAll();
    }       
}
