package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public Integer getAverageRating() {
        /**
         * todo implement. Should return the average rating of the product
         */
        return null;
    }

}
