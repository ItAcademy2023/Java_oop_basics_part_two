package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics{

    public Smartphone(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category, voltage, brand);
    }

    @Override
    public void displayProductInfo() {

    }
}
