package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.types.Category;

public class Clothing extends Product implements Returnable {

    String size;
    public Clothing(String name, double price, Category category, String size) {
        super(name, price, category);
        this.size = size;
    }

    public String getSize() { return this.size; }

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
