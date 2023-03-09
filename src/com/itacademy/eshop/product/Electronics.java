package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Electronics extends Product {

    private String voltage;
    private String brand;

    public Electronics(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category);
        this.voltage = voltage;
        this.brand = brand;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Voltage: " + getVoltage());
        System.out.println("Brand: " + getBrand());
    }

    public String getVoltage() {
        return voltage;
    }

    public String getBrand() {
        return brand;
    }

}
