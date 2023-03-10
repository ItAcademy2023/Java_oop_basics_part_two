package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Electronics extends Product {

    private int voltage;
    private String brand;

    public Electronics(String name, double price, Category category, int voltage, String brand) {
        super(name, price, category);
        this.voltage = voltage;
        this.brand = brand;
    }

    public int getVoltage() {
        return voltage;
    }

    //method overloading
    public String getVoltage(boolean check) {
        if (check) {
            return "In europe 220";
        }
        return "110";
    }

    public String getBrand() {
        return brand;
    }

}
