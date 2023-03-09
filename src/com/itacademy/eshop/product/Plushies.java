package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Plushies extends Toys{
    private String stuffingType;
    public Plushies(String name, double price, Category category, String stuffingType, String toyType) {
        super(name, price, category, toyType);
        this.stuffingType = stuffingType;
    }
    @Override
    public void displayProductInfo() {
        System.out.printf("Name: %s\n" +
                "Price: %.2f\n" +
                "Stuffing type: %s", getName(), getPrice(), getStuffingType());
    }

    public String getStuffingType() {
        return stuffingType;
    }
}
