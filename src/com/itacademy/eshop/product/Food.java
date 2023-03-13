package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Expiring;
import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product implements Expiring {

    private String expireDate;
    private String originCountry;

    public Food(String name, double price, Category category, String expireDate, String originCountry) {
        super(name, price, category);
        this.expireDate = expireDate;
        this.originCountry = originCountry;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    @Override
    public void displayExpireDate(String expireDate) {
        System.out.println("Expire Date is: " + this.expireDate);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Origin Country: " + getOriginCountry());
        System.out.println("Category: " + getCategory());
    }
}
