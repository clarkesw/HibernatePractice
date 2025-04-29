package com.coupon.controllers;

import com.coupon.models.Coupon;
import com.coupon.models.Manufacturer;
import com.coupon.models.Product;
import com.coupon.services.CouponService;
import com.coupon.services.ManufacturerService;
import com.coupon.services.ProductService;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

    @Autowired
    CouponService coupServ;
    
    @Autowired
    ProductService prodServ;
    
    @Autowired
    ManufacturerService manServ;
    
    Logger logger = LoggerFactory.getLogger(CouponController.class);
    
    @PostMapping("/save")
    public void saveCoupon(@ModelAttribute("coupon") Coupon coupon) {
        logger.info("POST /save " + coupon);
        coupServ.saveCoupon(coupon);
    }    
    
    @GetMapping("/coupon")
    public List<Coupon> getCoupons() {
        logger.info("GET /get");
        return coupServ.getCoupons();
    }    
    
    @GetMapping("/man")
    public List<Manufacturer> getManufacturers() {
        logger.info("GET /get/men");
        return manServ.getManufacturers();
    }    

    @GetMapping("/prod/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        logger.info("GET /get/prod/{id} " + id);
        return prodServ.findById(id);
    }   
    
    @GetMapping("/prod")
    public List<Product> getProducts() {
        logger.info("GET /get/prod/");
        List<Product> prods = prodServ.findAll();

        return prods;
    }        
}
