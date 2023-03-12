package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product {

    private String genre;
    private int pageCount;

    public Books(String name, double price, Category category, String genre, int pageCount) {
        super(name, price, category);
        this.genre = genre;
        this.pageCount = pageCount;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Genre: " + getGenre());
        System.out.println("Page count: " + getPageCount());
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
