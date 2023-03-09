package com.itacademy.eshop.product;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;

public abstract class Toys extends Product {
    String toyType;
    public Toys(String name, double price, Category category, String toyType) {
        super(name, price, category);
        this.toyType = toyType;
    }
}
