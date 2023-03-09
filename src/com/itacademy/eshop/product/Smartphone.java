package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics implements Discountable {
    private float screenSize;
    private String osVersion;

    public Smartphone(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category, voltage, brand);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(this.getName() + " phone`s OS version is " + osVersion
                + " and phone`s screen size is " + screenSize + ".");
    }

    @Override
    public void displayMostImportantIntValue() {
        System.out.println(this.getName() + " screen size is " + screenSize);
    }

    @Override
    public double calculateDiscountedPrice() {
        // ToDo
        return 0;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
