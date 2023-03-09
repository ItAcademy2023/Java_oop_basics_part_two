package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Clothing extends Product{

    private String colour;
    private int size;
    public Clothing(String name, double price, Category category, String colour, int size) {
        super(name, price, category);
        this.colour = colour;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: "+ getCategory());
        System.out.println("Taste: " + getColour());
        System.out.println("Rating: " + getSize());
    }
}
