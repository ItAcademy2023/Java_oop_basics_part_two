package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product {
    private String author;
    private int releaseYear;
    private int pageCount;

    public Books(String name, double price, Category category, String author, int releaseYear, int pageCount) {
        super(name, price, category);
        this.author = author;
        this.releaseYear = releaseYear;
        this.pageCount = pageCount;
    }
    public String getAuthor() {
        return author;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getPageCount() {
        return pageCount;
    }
}