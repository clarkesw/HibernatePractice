package com.coupon.services;

import com.coupon.models.Manufacturer;
import com.coupon.repositories.ManufacturerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerService {
    @Autowired
    ManufacturerRepository repo;
    
    public void saveManufacturer(Manufacturer coupon) {
        repo.save(coupon);
    }  
    
    public List<Manufacturer> getManufacturers() {
        return repo.findAll();
    }    
}
