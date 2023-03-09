package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import org.w3c.dom.ls.LSOutput;

public class Food extends Product{

    private String taste;

    private int rating;
    public Food(String name, double price, Category category, String taste, int rating) {
        super(name, price, category);
        this.taste = taste;
        this.rating = rating;

    }

    public String getTaste() {
        return taste;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: "+ getCategory());
        System.out.println("Taste: "+ getTaste());
        System.out.println("Rating: " + getRating());
    }

    @Override
    public void displaySettings() {

    }

}
