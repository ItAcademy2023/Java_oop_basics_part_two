package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Shirt extends Clothing {

    private String pattern;

    public Shirt(String name, double price, Category category, String colour, String material, String size, String pattern) {
        super(name, price, category, colour, material, size);
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Shirt is: " + getCategory());
    }
}
