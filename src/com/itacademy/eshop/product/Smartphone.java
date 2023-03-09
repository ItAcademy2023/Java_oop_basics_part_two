package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics {

    private double screenSize;

    public Smartphone(String name, double price, Category category, String voltage, String brand, double screenSize) {
        super(name, price, category, voltage, brand);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public void setDiscountedPrice() {
        super.setPrice(super.getPrice() * 0.9);
    }

    /** Overloading: setDiscountedPrice with specified discount percent */
    public void setDiscountedPrice(int discountPercent) {

        super.setPrice(super.getPrice() * (double) discountPercent / 100);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "\nPrice: " + getPrice() +
                        "\nCategory: " + getCategory() +
                        "\nScreen size: " + getScreenSize()
        );
    }


}
