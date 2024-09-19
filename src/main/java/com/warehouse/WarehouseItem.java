package com.warehouse;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class WarehouseItem {

    private String name;
    private Double price;
    private Double discount;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date date;
    
    
    public WarehouseItem(String name, Double price, Double discount, Date date) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public WarehouseItem() {

    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getDiscount() {
        return this.discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
