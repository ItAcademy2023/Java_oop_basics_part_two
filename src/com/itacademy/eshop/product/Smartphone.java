package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics{

    private int camerapixels;
    private int phoneweight;
    public Smartphone(String name, double price, Category category, String voltage, String brand, int camerapixels, int phoneweight) {
        super(name, price, category, voltage, brand);
        this.camerapixels = camerapixels;
        this.phoneweight = phoneweight;
    }

    public int getCamerapixels() {
        return camerapixels;
    }

    public int getPhoneweight() {
        return phoneweight;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: "+ getCategory());
        System.out.println("Category: "+ getCamerapixels());
        System.out.println("Rating: " + getPhoneweight());
    }
}
