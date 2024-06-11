package com.coupon.services;

import com.coupon.models.Product;
import com.coupon.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;
    
    public Product findById(Long id){
        return repo.findById(id).get();
    }
    
    public List<Product> findAll(){
        return repo.findAll();
    }
    
}
