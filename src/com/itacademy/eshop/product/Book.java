package com.itacademy.eshop.product;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;

public class Book extends Product {

    public Book(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {

    }
}
