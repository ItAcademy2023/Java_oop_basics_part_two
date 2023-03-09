package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {

    private boolean halal;

    public Food(String name, double price, Category category, boolean halal) {
        super(name, price, category);
        this.halal = halal;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Is it halal: " + isHalal());
    }

    public boolean isHalal() {
        return halal;
    }

    public void setHalal(boolean halal) {
        this.halal = halal;
    }
}
