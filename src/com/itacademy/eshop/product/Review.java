package com.itacademy.eshop.product;

public class Review extends Exception{
    public String author;
    public int rating;
    public String comment;

    public Review(String author, int rating, String comment) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
    public ProductNotFoundException(String message) {
        super(message);
    }


}