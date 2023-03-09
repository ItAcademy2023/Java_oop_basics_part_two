package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Food extends Product {

    public Food(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("This is food");
    }

    @Override
    public void displayProductColor() {

    }

}
