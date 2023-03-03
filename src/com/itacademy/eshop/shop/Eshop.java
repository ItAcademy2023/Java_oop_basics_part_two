package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;

import java.util.ArrayList;

public class Eshop {
    private String name;
    private ArrayList<Product> products;

    public Eshop(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Reviews:");
            for (Review review : product.getReviews()) {
                System.out.println("Author: " + review.getAuthor());
                System.out.println("Rating: " + review.getRating());
                System.out.println("Comment: " + review.getComment());
            }
            System.out.println("Average rating: " + product.getAverageRating());
            System.out.println("-----------------------------");
        }
    }

}
