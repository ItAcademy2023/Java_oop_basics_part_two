package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Clothing extends Product {

    private String texture;

    public Clothing(String name, double price, Category category, String texture) {
        super(name, price, category);
        this.texture = texture;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Texture: " + getTexture());
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
