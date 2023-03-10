package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics {
    public Smartphone(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category, voltage, brand);
    }
    public String getRam() {
        return "8GB";
    }
    @Override
    public void displayProductInfo() {
        System.out.println(
                "Category:" +  getCategory() +
                        "Voltage: " + getVoltage() +
                        "Price: " + getPrice() +
                        "RAM: " + getRam()
        );

        throw new UnsupportedOperationException("displayProductInfo() method is not implemented yet.");

    }
}
