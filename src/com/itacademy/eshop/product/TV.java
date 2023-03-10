package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class TV extends Electronics{

    public boolean available;
    public TV(String name, double price, Category category, String voltage, String brand, boolean available) {
        super(name, price, category, voltage, brand);
        this.available = available;
    }

    public boolean isAvailable(){ return false; }

    public void displayProductInfo(boolean isAvailable) {
        System.out.println(
                "Category:" +  getCategory() +
                        "Voltage: " + getVoltage() +
                        "Price: " + getPrice() +
                        "Is this item available:" + isAvailable()
        );
    }
}
