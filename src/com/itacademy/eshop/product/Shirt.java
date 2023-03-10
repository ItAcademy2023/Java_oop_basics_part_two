package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.NovelTypes;
import com.itacademy.eshop.product.types.Seasons;

public class Shirt extends Clothing {
    private char size;

    public Shirt(String name, double price, Category category, String type, int forAge, Seasons seasons, char size) {
        super(name, price, category, type, forAge, seasons);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Category: " + getCategory() +
                        "Type: " + getType() +
                        "For age: " + getForAge() +
                        "Season: " + getSeason() +
                        "Size: " + getSize()
        );
    }

    @Override
    public void showOnlyImportant() {
        System.out.println(
                "Price: " + getPrice() +
                        "For age: " + getForAge() +
                        "Season: " + getSeason() +
                        "Size: " + getSize()
        );
    }


}