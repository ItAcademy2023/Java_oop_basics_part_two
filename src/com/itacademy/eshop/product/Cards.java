package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Cards extends Toys {
    private int packSize;
    private boolean collectible;

    public Cards(String name, double price, Category category, String material, int forAgeAndUp, int packSize, boolean collectible) {
        super(name, price, category, material, forAgeAndUp);
        this.packSize = packSize;
        this.collectible = collectible;
    }

    public String getCollectible() {
        if (collectible) {
            return "It is collectible";
        } else {
            return "It is not collectible";
        }

    }

    public int getPackSize() {
        return packSize;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Category: " + getCategory() +
                        "Material:" + getMaterial() +
                        "From: " + getForAgeAndUp() + "age and up" +
                        "Pack size: " + getPackSize() +
                        getCollectible()
        );

    }

    @Override
    public void showOnlyImportant() {
        System.out.println("Name: " + getName() + "Price: " + getPrice());
    }

}