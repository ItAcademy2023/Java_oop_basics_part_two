package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {
    String expiryDate;
    boolean isVegetable;
    public Food(String name, double price, Category category, String expiryDate, boolean isVegetable) {
        super(name, price, category);
        this.expiryDate = expiryDate;
        this.isVegetable = isVegetable;
    }

    public String getExpiryDate() { return this.expiryDate; }

    public boolean getIsVegetable() { return this.isVegetable; }
}
