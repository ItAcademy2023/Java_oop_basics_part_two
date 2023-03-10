package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class ToyCar extends Toy{
    public String color;
    public boolean batteriesIncluded;

    public ToyCar(String name, double price, Category category, String color, boolean batteriesIncluded) {
        super(name, price, category);
        this.color = color;
        this.batteriesIncluded = batteriesIncluded;
    }

    public String getColor() { return color; };
    public boolean isBatteriesIncluded(){ return true; }

    @Override
    public void displayProductInfo(){
        System.out.println(
                "Category: " + getCategory() +
                        "Name: " + getName() +
                        "Color: " + getColor() +
                        "Batteries included: " + isBatteriesIncluded()
        );
    }
}
