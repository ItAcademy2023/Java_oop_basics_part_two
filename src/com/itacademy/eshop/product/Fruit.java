package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.NovelTypes;

public class Fruit extends Food {
    private String fruitCountry;

    public Fruit(String name, double price, Category category, String taste, int weight, String fruitCountry) {
        super(name, price, category, taste, weight);
        this.fruitCountry = fruitCountry;
    }

    public String getFruitCountry() {
        return fruitCountry;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Category: " + getCategory() +
                        "Taste:" + getTaste() +
                        "Weight: " + getWeight() +
                        "The fruit is from: " + getFruitCountry()
        );
    }

    @Override
    public void showOnlyImportant() {
        System.out.println(
                "Name: " + getName() +
                        "Category: " + getCategory() +
                        "Taste:" + getTaste()
        );
    }


}