package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Clothing extends Product {


    public Clothing(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("This is a clothe");
    }

    @Override
    public void displayProductColor() {

    }
}
