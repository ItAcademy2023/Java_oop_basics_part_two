package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Food extends Product {

    private String ingredients;

    public Food(String name, double price, Category category, String ingredients) {
        super(name, price, category);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public void setDiscountedPrice() {
        super.setPrice(super.getPrice() * 0.5);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "\nPrice: " + getPrice() +
                        "\nCategory: " + getCategory() +
                        "\nIngredients: " + getIngredients()
        );
    }
}
