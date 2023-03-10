package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Book extends Product {

    public Book(String name, double price, Category category) {
        super(name, price, category);
    }

    public void displayProductInfo() {
        System.out.println(
                "Category:" + getCategory()

        );
    }
}
