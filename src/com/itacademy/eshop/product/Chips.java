package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Chips extends Food{
    private String brand;
    private String flavor;
    public Chips(String name, double price, Category category, String brand, String flavor) {
        super(name, price, category);
        this.brand = brand;
        this.flavor = flavor;
    }

    public String getBrand() { return brand; }

    public String getFlavor() { return flavor; }

    @Override
    public void displayProductInfo(){
        System.out.println(
                " Category: " + getCategory() +";"+
                        " Brand: " + getBrand() +";"+
                        " Flavor: " + getFlavor() +";"+
                        " Price: " + getPrice()
        );
    }
}
