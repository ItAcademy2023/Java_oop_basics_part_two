package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Expirable;
import com.itacademy.eshop.product.types.Category;

import java.util.Date;

public class Food extends Product implements Expirable {
    private String taste;
    private int spiceLvl;
    private Date expirationDate;

    public Food(String name, double price, Category category) {
        super(name, price, category);
    }

    // Useless overloading
    public void displayProductInfo(String text) {
        System.out.println(this.getName() + " is " + text + ". It taste is "
                + taste + ". It has spice level of " + spiceLvl + ".");
    }

    @Override
    public void displayProductInfo() {
        System.out.println(this.getName() + " taste is " + taste + ". It has spice level of " + spiceLvl + ".");
    }

    @Override
    public void displayMostImportantIntValue() {
        System.out.println(this.getName() + " spice is " + spiceLvl);
    }

    @Override
    public boolean isExpirable() {
        return expirationDate != null;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getSpiceLvl() {
        return spiceLvl;
    }

    public void setSpiceLvl(int spiceLvl) {
        this.spiceLvl = spiceLvl;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
