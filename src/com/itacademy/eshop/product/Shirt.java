package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Shirt extends Clothing{
    private String color;
    public Shirt(String name, double price, Category category, String color) {
        super(name, price, category);
        this.color = color;
    }

    public String getColor(){return color;}

    @Override
    public double getPrice(){ return super.getPrice()* .8 ;}

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Category:" + getCategory() +
                        "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Color: " + getColor()

        );
    }
}
