package com.itacademy.eshop.services;

import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    /*** This class is used for creating new e-shop object and initializing it with some products.
     */

    public Eshop createShop() {
        /** Should create new e-shop object and initialize it with some products.
         * Should return e-shop object.
         */
        ArrayList<Product> products = createProducts();
        return new Eshop("My shop",  products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * Each product must be different class. For example: Computer, Shirt etc.
         * Each class must extend AbstractProduct class.
         * So you will have to create at least 6 classes that extend Product class.
         */
        return new ArrayList<>(List.of(
                new Computer("Mac", 3000, Category.ELECTRONICS, "12", "apple", "M1", 16),
                new Book("John Author", "Science",  "Java for dummies", 19.99, Category.BOOKS),
                new Lego(false, "Lego Ninjago",  12.99, Category.TOYS, 20),
                new Liquid(145, new ArrayList<String>(List.of(
                        "Coffee beans", "Dirt"
                )),  false,"Huracan coffee", 8.99, Category.FOOD, 2),
                new Phone("Samsung S20", 700, Category.ELECTRONICS, "21.23", "Samsung", 21, "Samsung"),
                new Clothing("Shirt", 12.33, Category.CLOTHING, "Silk", "Zara")
        ));
    }

}
