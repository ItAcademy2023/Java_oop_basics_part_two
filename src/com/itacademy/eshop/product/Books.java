package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product implements ReadableOnline{
    public Books(String name, double price, Category category) {
        super(name, price, category);
    }
}
