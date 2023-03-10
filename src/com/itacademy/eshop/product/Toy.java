package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Toy extends Product {
    private String toyType;

    public Toy(String name, double price, Category category, String toyType) {
        super(name, price, category);
        this.toyType = toyType;
    }

    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Toy name: " + getName());
        System.out.println("Toy type: " + toyType);
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
    }

    @Override
    public void deleteReviewByAuthor(String author) {
        if (this.getReviews().size() != 0) {
            for (Review review : getReviews()) {
                if (review.getAuthor().equals(author)) {
                    getReviews().remove(review);
                    break;
                }
            }
        }
    }
}
