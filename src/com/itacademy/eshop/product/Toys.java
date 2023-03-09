package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Toys extends Product {

    public Toys(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("This is a toy");
    }

    @Override
    public void displayProductColor() {

    }
}
