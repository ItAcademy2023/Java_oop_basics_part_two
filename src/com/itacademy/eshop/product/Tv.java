package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Tv extends Electronics {

    private String screenType;
    private int screenSize;

    public Tv(String name, double price, Category category, String voltage, String brand,
              String screenType, int screenSize) {
         super(name, price, category, voltage, brand);
        this.screenType = screenType;
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public double getPrice(double discount) {
        return super.getPrice() * discount;
    }

    public double getPrice() {
        return super.getPrice() * 1.8;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Brand: " + getBrand()
        );
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Tv category is: " + getCategory());
    }
}
