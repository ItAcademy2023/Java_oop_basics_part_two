package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics {
    int memoryram;
    String cpuName;
    String screenResolution;
    public Smartphone(String name, double price, Category category, String voltage, String brand, int memoryram, String cpuName, String screenResolution) {
        super(name, price, category, voltage, brand);
        this.memoryram = memoryram;
        this.cpuName = cpuName;
        this.screenResolution = screenResolution;
    }

    @Override
    public void displayProductInfo() {
        System.out.printf("""
                Name: %s
                Brand: %s
                Price: %.2f
                Memory: %d
                CPU name: %s
                """, getName(), getBrand(), getPrice(), this.memoryram, this.cpuName);
    }
    @Override
    public void abstractOverridenMethod() {
        throw new UnsupportedOperationException("abstractOverriddenMethod() method is not implemented yet.");
    }
}
