package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
//display more specific
public abstract class Toys extends Product {

    private String material;
    private int AgeGroup;

    public Toys(String name, double price, Category category, String material, int AgeGroup) {
        super(name, price, category);
        this.material = material;
        this.AgeGroup = AgeGroup;
    }

    public String getMaterial() {
        return material;
    }

    public int getAgeGroup() {
        return AgeGroup;
    }
}
