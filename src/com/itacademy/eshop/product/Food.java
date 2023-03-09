package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {

    public Food(String name, double price, Category category) {
        super(name, price, category);
    }
}
