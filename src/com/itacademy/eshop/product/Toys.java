package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Toys extends Product {

    private int agelimit;
    private int weight;
    public Toys(String name, double price, Category category, int agelimit, int weight) {
        super(name, price, category);
        this.agelimit = agelimit;
        this.weight = weight;
    }

    public int getAgelimit() {
        return agelimit;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: "+ getCategory());
        System.out.println("Age Limit: " + getAgelimit());
        System.out.println("Weight: " + getWeight());
    }
}
