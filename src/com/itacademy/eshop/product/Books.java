package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Books extends Product {

    private String author;
    private int pages;

    public Books(String name, double price, Category category, String author, int pages) {
        super(name, price, category);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                " Author " + getAuthor() +
                        " Pages " + getPages() +
                        " Price " + getPrice())
        ;
    }

    @Override
    public void printOutTotalPrice() {

    }
    @Override
    public void setDiscountedPrice() {
    }
}
