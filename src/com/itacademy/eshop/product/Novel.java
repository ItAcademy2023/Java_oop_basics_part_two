package com.itacademy.eshop.product;

import com.itacademy.eshop.product.Book;
import com.itacademy.eshop.product.types.Category;

public class Novel extends Book {
    private String author;
    private String genre;
    private String title;
    public Novel(String name, double price, Category category, String author, String genre, String title) {
        super(name, price, category);
        this.author = author;
        this.genre = genre;
        this.title = title;
    }

    public String getAuthor(){ return author; }
    public String getGenre(){ return genre; }
    public String getTitle(){ return title; }

    @Override
    public void displayProductInfo(){
        System.out.println(
                " Category: " + getCategory() +";"+
                        " Author: " + getAuthor() +";"+
                        " Genre: " + getGenre() +";"+
                        " Title: " + getTitle() +";"+
                        " Price: " + getPrice()
        );
    }

}
