package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Books extends Product{

    private String genre;
    private int pages;
    public Books(String name, double price, Category category, String genre, int pages) {
        super(name, price, category);
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: "+ getCategory());
        System.out.println("Category: "+ getGenre());
        System.out.println("Rating: " + getPages());
    }
}
