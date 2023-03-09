package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product{

    String author;
    int numberOfPages;

    public Books(String name, double price, Category category, String author, int numberOfPages) {
        super(name, price, category);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() { return this.author; }

    public int getNumberOfPages() { return this.numberOfPages;}
}
