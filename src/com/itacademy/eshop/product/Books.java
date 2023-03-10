package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product {
    public String author;
    public String genres;

    public Books(String name, double price, Category category, String author, String genres) {
        super(name, price, category);
        this.author = author;
        this.genres = genres;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenres() {
        return genres;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Price" + getPrice()
        );
    }
}
