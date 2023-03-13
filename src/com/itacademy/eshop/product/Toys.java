package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Toys extends Product {

    private String material;

    public Toys(String name, double price, Category category, String material) {
        super(name, price, category);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Material: " + getMaterial());
        System.out.println("Price: " + getPrice());
    }
}
