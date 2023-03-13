package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Flour extends Food {

    private String type;

    public Flour(String name, double price, Category category, String expireDate, String originCountry, String type) {
        super(name, price, category, expireDate, originCountry);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayExpireDate(String expireDate) {
        super.displayExpireDate(expireDate);
    }

    @Override
    public void displayExpireDate() {
        System.out.println("Expires: " + getExpireDate());
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Flour is: " + getCategory());
    }
}
