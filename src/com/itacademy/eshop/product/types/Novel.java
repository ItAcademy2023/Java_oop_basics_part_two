package com.itacademy.eshop.product.types;

import com.itacademy.eshop.product.Book;

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
}
