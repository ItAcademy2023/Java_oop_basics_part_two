package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Food extends Product{

    boolean eco;
    boolean containsAllergens;

    public Food(String name, double price, Category category, boolean eco, boolean containsAllergens) {
        super(name, price, category);
        this.eco = eco;
        this.containsAllergens = containsAllergens;
    }

    @Override
    public void displayProductInfo() {
                System.out.println(
                        "Product name: " + getName() + " price: " + getPrice() + " product category: " + getCategory()
                                + " eco " + eco + " allergens: " + containsAllergens
                );
    }

    @Override
    public void displayProductReview() {

    }
}
