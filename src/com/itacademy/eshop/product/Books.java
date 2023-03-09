package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Books extends Product{

    String author;
    String genre;
    int pages;

    public Books(String name, double price, Category category, String author, String genre, int pages) {
        super(name, price, category);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Author: " + author + ";  Product name: " + getName() +   ";  genre: " + genre + ";  price: " + getPrice() + ";  product category: " + getCategory()
                         + ";  pages: " + pages
        );
    }

    @Override
    public void displayProductReview() {

    }
}
