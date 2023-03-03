package com.itacademy.product;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private Category category;
    private List<Review> reviews;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();
    }
}
