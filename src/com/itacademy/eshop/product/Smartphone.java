package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

//task Inheritance 2.
public class Smartphone extends Electronics {

    private char size;
    private String operatingSystem;

    public Smartphone(String name, double price, Category category, int voltage, String brand, char size, String operatingSystem) {
        super(name, price, category, voltage, brand);
        this.size = size;
        this.operatingSystem = operatingSystem;
    }

    public char getSize() {
        return size;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Category: " + getCategory() +
                        "Voltage:" + getVoltage() +
                        "Brand: " + getBrand() +
                        "Phone size: " + getSize() +
                        "Operating system: " + getOperatingSystem()
        );
    }

    @Override
    public void showOnlyImportant() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Brand: " + getBrand()

        );
    }
}
