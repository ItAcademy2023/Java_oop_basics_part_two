package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Stories extends Books {
    public Stories(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {

    }

    @Override
    public void newAbstractMethod() {

    }

    @Override
    public boolean isReadableOnline() {
        return true;
    }
}
