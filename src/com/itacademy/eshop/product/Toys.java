package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Warnings;
import com.itacademy.eshop.product.types.Category;

public class Toys extends Product implements Warnings {

    boolean smallParticles;
    boolean educational;

    public Toys(String name, double price, Category category, boolean smallParticles, boolean educational) {
        super(name, price, category);
        this.smallParticles = smallParticles;
        this.educational = educational;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Product name: " + getName() + " price: " + getPrice() + " product category: " + getCategory()
                        + " contains small particles " + smallParticles + " educational: " + educational
        );
    }

    @Override
    public void displayProductReview() {

    }

    @Override
    public void isKidSafe() {
        if(smallParticles) {
            System.out.println("Contains small particles, may cause suffocation!");
        }
    }
}
