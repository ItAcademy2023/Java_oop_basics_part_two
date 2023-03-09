package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Book extends Product{
    private String author;
    private String genre;

    public Book (String author, String genre, String name, double price, Category category) {
        super(name, price, category);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }
    public void setGenre(String newGenre){
        genre = newGenre;
    }
    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName()
                        + "Price: " + getPrice()
                        + "Category: " + getCategory()
                        + "Genre:  " + getGenre()
                        + "Author:  " + getAuthor()
        );
    }
}

