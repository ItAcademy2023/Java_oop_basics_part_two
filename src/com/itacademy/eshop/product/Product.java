package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public abstract class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;

    //the parent
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

    /**
     * getAverageRating(): This method encapsulates the calculation of the average rating of a product's reviews.
     * By computing the average internally based on the private reviews field and returning only the result, it hides
     * the implementation details and complexity of the calculation from external code, making
     * the code more modular and easier to maintain.
     */
    public double getAverageRating() {
        double sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return sum / reviews.size();
    }

    /**
     * Write similar public method to getAverageRating that uses private
     * fields and some logic to return desired output.
     */
    public ArrayList<Review> getReview(int rating) {
        ArrayList<Review> reviews = new ArrayList<>();
        for (Review review : getReviews()) {
            if (review.getRating() >= rating) {
                reviews.add(review);
            }

        }
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void displayProductInfo();//overrride in other classes


    public abstract void printOutTotalPrice();
    public abstract void setDiscountedPrice();

}