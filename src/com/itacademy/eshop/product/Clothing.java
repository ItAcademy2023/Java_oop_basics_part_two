package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Clothing extends Product {

    private String colour;
    private String material;
    private String size;

    public Clothing (String name, double price, Category category, String colour, String material, String size) {
        super(name, price, category);
        this.colour = colour;
        this.material = material;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Material: " + getMaterial());
        System.out.println("Colour: " + getColour());
        System.out.println("Size: " + getSize());
    }

    public abstract void displayProductCategory();
}
