package com.coupon.models;

import com.coupon.enums.ManufacturerType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String name;
    private ManufacturerType type;
    
    @JsonManagedReference
    @OneToMany(mappedBy="manufacturer")
    private List<Product> products;
    private String location;
    private String email;

    public Manufacturer() {
    }

    public Manufacturer(Long id, String name, ManufacturerType type, List<Product> products, String location, String email) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.products = products;
        this.location = location;
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManufacturerType getType() {
        return type;
    }

    public void setType(ManufacturerType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "id=" + id + ", name=" + name + ", type=" + type + ", products=" + products + ", location=" + location + ", email=" + email + '}';
    }
}
