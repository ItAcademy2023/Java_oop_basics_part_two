package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Toys extends Product {

    public Toys(String name, double price, Category category) {
        super(name, price, category);
    }
}
