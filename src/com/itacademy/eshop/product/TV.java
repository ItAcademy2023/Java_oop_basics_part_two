package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class TV extends Electronics{
    public TV(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category, voltage, brand);
    }


    @Override
    public void displayProductInfo() {

    }

    @Override
    public void newAbstractMethod() {

    }
}
