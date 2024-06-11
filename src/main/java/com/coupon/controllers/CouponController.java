package com.coupon.controllers;

import com.coupon.models.Coupon;
import com.coupon.models.Manufacturer;
import com.coupon.models.Product;
import com.coupon.services.CouponService;
import com.coupon.services.ManufacturerService;
import com.coupon.services.ProductService;

import java.util.List;
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

    @PostMapping("/save")
    public void saveCoupon(@ModelAttribute("coupon") Coupon coupon) {
        coupServ.saveCoupon(coupon);
    }    
    
    @GetMapping("/get")
    public List<Coupon> getCoupons() {
        return coupServ.getCoupons();
    }    
    
    @GetMapping("/get/men")
    public List<Manufacturer> getManufacturers() {
        return manServ.getManufacturers();
    }    

    @GetMapping("/get/prod/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        System.out.println("~~~ " + id);
        return prodServ.findById(id);
    }   
    
    @GetMapping("/get/prod")
    public List<Product> getProducts() {
        List<Product> prods = prodServ.findAll();
        
 //       prods.stream()
 //               .forEach(System.out::println);

        return prods;
    }        
}
