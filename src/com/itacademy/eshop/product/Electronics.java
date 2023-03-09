package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.types.Category;

public abstract class Electronics extends Product implements Returnable {

    private String voltage;
    private String brand;

    public Electronics(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category);
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
