package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.PayableByInstallments;
import com.itacademy.eshop.product.types.Category;

public abstract class TV extends Electronics implements PayableByInstallments {

    private double size;

    public TV(String name, double price, Category category, String voltage, String brand, double size) {
        super(name, price, category, voltage, brand);
        this.size = size;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Size: " + getSize());
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean payInInstallments() {
        return true;
    }
}
