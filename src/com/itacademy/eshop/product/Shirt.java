package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Shirt extends Clothing{
    public Shirt(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Category:" + getCategory() +
                        "Name: " + getName() +
                        "Price: " + getPrice()

        );
    }
}
