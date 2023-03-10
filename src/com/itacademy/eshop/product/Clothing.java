package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Clothing extends Product{
    private String material;
    public Clothing(String name, double price, Category category, String material) {
        super(name, price, category);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
}
