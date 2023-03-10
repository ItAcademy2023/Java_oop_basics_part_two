package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product{
    private String genre;
    private int pageCount;
    public Books(String name, double price, Category category, String genre, int pageCount) {
        super(name, price, category);
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }
}
