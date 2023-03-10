package com.itacademy.eshop.product;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;

//display more specific
public abstract class Food extends Product {

    private String drinks;
    private String meals;

    public Food(String name, double price, Category category, String drinks, String meals) {
        super(name, price, category);
        this.drinks = drinks;
        this.meals = meals;
    }

    public String getDrinks() {
        return drinks;
    }

    public String getMeals() {
        return meals;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "\nPrice of food: " + getPrice() +
                        "\nDrinks: " + getDrinks() +
                        "\nMeals: " + getMeals()
        );
    }

    @Override
    public void setDiscountedPrice() {
        super.setPrice(super.getPrice() * 0.5);
    }
}