package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.types.Category;

public class Toys extends Product implements Returnable {

    int ageLimit;
    public Toys(String name, double price, Category category, int ageLimit) {
        super(name, price, category);
        this.ageLimit = ageLimit;
    }

    public int getAgeLimit() { return this.ageLimit; }

    @Override
    public String returnProduct() {
        return null;
    }

    @Override
    public void displayProductInfo() {

    }

    @Override
    public void displayProductColor() {

    }
}
