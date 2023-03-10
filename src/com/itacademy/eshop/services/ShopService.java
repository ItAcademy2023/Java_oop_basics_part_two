package com.itacademy.eshop.services;

import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
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
        ArrayList<Product> list = new ArrayList<Product>();
        Computer computer = new Computer("name", 500, Category.ELECTRONICS, "125", "Dell",
                "inter", 1);
        Clothing shirt = new Clothing("shirt", 15.90, Category.CLOTHING, "some", "s", "cooton");
        Food food = new Food("cucumbers", 8.99, Category.FOOD, true, true);
        Books books = new Books("death in village", 23.00, Category.BOOKS, "Peter Thomas", "detective", 345);
        Smartphone smartphone = new Smartphone("max pro", 600.90, Category.ELECTRONICS, "100", "apple");
        Toys toys = new Toys("lego", 25.90, Category.TOYS, true, true);
//        throw new UnsupportedOperationException("createProducts() method is not implemented yet.");
       list.add(computer);
       list.add(shirt);
       list.add(food);
       list.add(books);
       list.add(smartphone);
       list.add(toys);
        return list;
    }

}
