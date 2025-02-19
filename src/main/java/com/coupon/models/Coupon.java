package com.coupon.models;

import jakarta.persistence.*;

@Entity
public class Coupon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(mappedBy = "coupon")
    private Product product;
    
    private String code;
    private Double discount;
    private String expdate;

    public Coupon() {}

    public Coupon(String code, Double discount, String expDate) {
        this.code = code;
        this.discount = discount;
        this.expdate = expDate;
    }  

    public Coupon(Long id, String code, Double discount, String expdate) {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.expdate = expdate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    @Override
    public String toString() {
        return "Coupon{" + "id=" + id + ", code=" + code + ", discount=" + discount + ", expDate=" + expdate + '}';
    }
}
