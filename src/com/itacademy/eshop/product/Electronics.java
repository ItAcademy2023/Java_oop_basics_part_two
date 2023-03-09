package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Electronics extends Product {

    private final String voltage;
    private final String brand;

    public Electronics(String name, double price, Category category, int ProductIdentifier, String voltage, String brand) {
        super(name, price, category, ProductIdentifier);
        this.voltage = voltage;
        this.brand = brand;
    }


    public String getVoltage() {
        return voltage;
    }

    public String getBrand() {
        return brand;
    }
}
