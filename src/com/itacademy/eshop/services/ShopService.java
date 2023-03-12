package com.itacademy.eshop.services;

import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Genre;
import com.itacademy.eshop.product.types.ToyType;
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
        ArrayList<Product> productsArrList = new ArrayList<>();

        Computer computer = new Computer("Computer name", 1000.2, Category.ELECTRONICS, "unknown", "VIP", "known", 8);
        productsArrList.add(computer);
        Book book = new Book("Fairytale name", 10.2, Category.BOOKS, Genre.FAIRYTALE);
        productsArrList.add(book);
        Smartphone smartphone = new Smartphone("Laptop", 499.9, Category.ELECTRONICS, "unknown", "VI brand", 6.5);
        productsArrList.add(smartphone);
        Food banana = new Food("Banana", 0.59, Category.FOOD, "100% banana");
        productsArrList.add(banana);
        Clothing shirt = new Clothing("Shirt", 15, Category.CLOTHING, 36);
        productsArrList.add(shirt);
        Toy puzzle = new Toy("Puzzle name", 7, Category.TOYS, ToyType.PUZZLES);
        productsArrList.add(puzzle);

        return productsArrList;
    }

}
