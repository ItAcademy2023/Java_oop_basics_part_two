package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Computer;
import com.itacademy.eshop.product.Food;
import com.itacademy.eshop.product.Product;
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
        ArrayList<Product> myList = new ArrayList<>();
        Product product1 = new Computer("Samsung laptop", 700, Category.ELECTRONICS, "100W", "Labas", "intel", 16);
        Product product2 = new Food("Hot dog", 3, Category.FOOD);


        myList.add(product1);
        myList.add(product2);

        return myList;
    }

}
