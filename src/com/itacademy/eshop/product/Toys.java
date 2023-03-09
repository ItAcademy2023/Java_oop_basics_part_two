package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Toys extends Product {

    private String material;
    private int forAgeAndUp;

    public Toys(String name, double price, Category category,String material,int forAgeAndUp) {
        super(name, price, category);
        this.forAgeAndUp=forAgeAndUp;
        this.material=material;
    }
    public String getMaterial() {
        return material;
    }
    public int getForAgeAndUp() {
        return forAgeAndUp;
    }
}
