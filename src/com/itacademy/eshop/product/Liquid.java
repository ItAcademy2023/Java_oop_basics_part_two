package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public class Liquid extends Food {
    private double size;

    public Liquid(int calories, ArrayList<String> ingredients, boolean isOutOfDate, String name, double price, Category category, double size) {
        super(calories, ingredients, isOutOfDate, name, price, category);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public void changeProductName(String newName) {
        setName(newName);
    }
    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName()
                        + "Name: " + getName()
                        + "Price: " + getPrice()
                        + "Category: " + getCategory()
                        + "Ingredients: " + getIngredients()
                        + "Is out of date: " + getIsOutOfDate()
                        + "Liquid size: : " + getSize()

        );
    }
}
