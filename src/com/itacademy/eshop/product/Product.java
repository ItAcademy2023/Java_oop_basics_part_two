package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public abstract class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;

    //new abstract method declaration
    private int ProductIdentifier;

    public Product(String name, double price, Category category, int ProductIdentifier) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();

        //new constructor to the method
        this.ProductIdentifier = ProductIdentifier;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {        return category;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    //getter for the Product Identifier method
    public int getProductIdentifier(){
        return ProductIdentifier;
    }

    /**
     getAverageRating(): This method encapsulates the calculation of the average rating of a product's reviews.
     By computing the average internally based on the private reviews field and returning only the result, it hides
     the implementation details and complexity of the calculation from external code, making
     the code more modular and easier to maintain.
     */
    public double getAverageRating() {
        double sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return sum / reviews.size();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }


    public void setPrice(int price) {
        this.price = price;
    }

    //setter for product Identifier

    public abstract void displayProductInfo();


}
