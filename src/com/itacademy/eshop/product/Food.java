package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {
    private double grossWeight;
    public Food(String name, double price, Category category, double grossWeight) {
        super(name, price, category);
        this.grossWeight = grossWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }
}
