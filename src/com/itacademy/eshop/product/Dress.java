package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Dress extends Clothing {

    private int length;

    public Dress(String name, double price, Category category, String colour, String material, String size, int length) {
        super(name, price, category, colour, material, size);
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Dress is " + getCategory());
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }
}
