package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Book extends Product {

    private String bookAuthor;

    public Book(String name, double price, Category category, String bookAuthor) {
        super(name, price, category);
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Book name: " + getName());
        System.out.println("Book author: " + bookAuthor);
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
