package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class TV extends Electronics{
    public TV(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category, voltage, brand);
    }

    public void displayProductInfo(boolean isAvailable) {
        System.out.println(
                "Category:" +  getCategory() +
                        "Voltage: " + getVoltage() +
                        "Price: " + getPrice() +
                        "Is this item available:" + isAvailable
        );
    }
}
