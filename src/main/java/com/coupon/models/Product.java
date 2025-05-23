package com.coupon.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id",
    scope = Product.class
)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "manufacturer_id") //, referencedColumnName = "id")
//    @JsonBackReference
    @JsonIgnore
    private Manufacturer manufacturer;
    
    @OneToOne
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;
    private int price;

    public Product() {}

    public Product(Long id, String name, String description, Manufacturer manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
  //      this.coupon = coupon;
        this.price = price;
    }

//    public Coupon getCoupon() {
//        return coupon;
//    }
//
//    public void setCoupon(Coupon coupon) {
//        this.coupon = coupon;
//    }

    public Long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Manufacturer getManufacturer_props() {
        return manufacturer;
    }

    public void setManufacturer_props(Manufacturer manufacturer_props) {
        this.manufacturer = manufacturer_props;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", manufacturer=" + manufacturer + '}';
    }
}
