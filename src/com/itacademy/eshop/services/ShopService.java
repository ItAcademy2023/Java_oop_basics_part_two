package com.itacademy.eshop.services;

import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.Novel;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;

public class ShopService {
    /*** This class is used for creating new e-shop object and initializing it with some products.
     */

    public Eshop createShop() {
        /** Should create new e-shop object and initialize it with some products.
         * Should return e-shop object.
         */
        ArrayList<Product> products = createProducts();
        return new Eshop("My shop", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * Each product must be different class. For example: Computer, Shirt etc.
         * Each class must extend AbstractProduct class.
         * So you will have to create at least 6 classes that extend Product class.
         */
        ArrayList<Product> products = new ArrayList<>();
        new Computer("Computer", 599, Category.ELECTRONICS, "123", "Acer", "intel", 12);
        new Shirt("Shirt", 35, Category.CLOTHING, "green");
        new Novel("Book", 15, Category.BOOKS, "Charles Dickens", "Serial novel", "Oliver Twist" );
        new Chips("Chips", 1.99, Category.FOOD, "Lay's", "onion");
        new TV("TV", 699, Category.ELECTRONICS, "220V", "LG", false);
        new ToyCar("ToyCar", 25.99, Category.TOYS, "blue", true);

        return products;
    }


    }


