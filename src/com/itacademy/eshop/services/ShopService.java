package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Computer;
import com.itacademy.eshop.product.Smartphone;
import com.itacademy.eshop.product.Cards;
import com.itacademy.eshop.product.Fruit;
import com.itacademy.eshop.product.Novel;
import com.itacademy.eshop.product.Shirt;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.NovelTypes;
import com.itacademy.eshop.product.types.Seasons;

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

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Computer("myPc", 500, Category.ELECTRONICS, 110, "brandNew", "intel", 16));
        products.add(new Smartphone("iPhone", 800, Category.ELECTRONICS, 110, "Apple", 'M', "iOS"));
        products.add(new Cards("Bicycle", 5, Category.TOYS, "paper", 5, 52, false));
        products.add(new Fruit("Banana", 3, Category.FOOD, "Sweet", 10, "India"));
        products.add(new Novel("GoT", 30, Category.BOOKS, "GRRM", 1996, 500, NovelTypes.HISTORICAL));
        products.add(new Shirt("Vans", 40, Category.CLOTHING, "Long sleeve", 18, Seasons.SPRING, 'S'));


        return products;
    }

}
