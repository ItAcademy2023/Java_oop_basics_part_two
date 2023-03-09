package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {
    private String taste;
    private int weight;

    public Food(String name, double price, Category category, String taste, int weight) {
        super(name, price, category);
        this.taste = taste;
        this.weight = weight;
    }
    public String getTaste() {
        return taste;
    }
    public int getWeight() {
        return weight;
    }
}
