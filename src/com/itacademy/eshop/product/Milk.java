package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Milk extends Food {

    private String packing;

    public Milk(String name, double price, Category category, String expireDate, String originCountry, String packing) {
        super(name, price, category, expireDate, originCountry);
        this.packing = packing;
    }

    public String getPacking() {
        return packing;
    }

    @Override
    public void displayExpireDate() {
        System.out.println("Expire Date is: " + getExpireDate());
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Milk category is: " + getCategory());
    }
}
