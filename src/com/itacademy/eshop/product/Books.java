package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Books extends Product{

    private int pages;
    private String author;

    public Books(String name, double price, Category category, int pages, String author) {
        super(name, price, category);
        this.pages = pages;
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }
    public abstract void displayProductCategory();

    @Override
    public void displayProductInfo() {
        System.out.println("Author: " + getAuthor());
        System.out.println("Page number: " + getPages());
    }
}
