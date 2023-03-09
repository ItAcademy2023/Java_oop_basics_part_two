package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Clothing extends Product{
    public Clothing(String name, double price, Category category) {
        super(name, price, category);
    }
}
