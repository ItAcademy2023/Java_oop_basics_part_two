package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Toy extends Product {
    public Toy(String name, double price, Category category) {
        super(name, price, category);
    }
}
