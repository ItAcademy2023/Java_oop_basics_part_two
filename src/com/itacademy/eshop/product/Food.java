package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Food extends Product {
    private int calories;

    public Food(String name, double price, Category category, int calories) {
        super(name, price, category);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Food name: " + getName());
        System.out.println("Calories : " + calories);
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
    }

    @Override
    public void deleteReviewByAuthor(String author) {
        if (this.getReviews().size() != 0) {
            for (Review review : this.getReviews()) {
                if (review.getAuthor().equals(author)) {
                    this.getReviews().remove(review);
                    break;
                }
            }
        }
    }
}
