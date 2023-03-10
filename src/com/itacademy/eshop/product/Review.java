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
/**Encapsulation
variables accessable outside of that class
 The set method takes a parameter (newAuthor) and assigns it to the name variable.
 The this keyword is used to refer to the current object.*/
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setComment(String newComment) {
        this.comment = newComment;
    }

}