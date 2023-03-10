package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Toys extends Product {

    public String suitableFor;

    public Toys(String name, double price, Category category, String suitableFor) {
        super(name, price, category);
        this.suitableFor = suitableFor;
    }

    public String getSuitableFor() {
        return suitableFor;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Price" + getPrice()
        );
    }
}
