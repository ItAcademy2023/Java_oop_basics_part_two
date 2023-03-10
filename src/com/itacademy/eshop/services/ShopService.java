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
        //create new array list
        //Product product = new Product();// these are both objects
        //contructor creates objects
        //ArrayList electronics = new ArrayList<>();
        //child and parent class fields
        ArrayList<Product> productsNew = new ArrayList<>();

        //took created array list and added new computer object
        productsNew.add(new Computer("Laptop", 100, Category.ELECTRONICS, "123", "Dell", "intel", 12));

        productsNew.add(new Clothing("Shirt", 100, Category.CLOTHING, "leather", "winter"));
        productsNew.add(new Smartphone("Iphone", 100, Category.ELECTRONICS, "111", "Iphone", "M", "8"));

        return productsNew;

        //        throw new UnsupportedOperationException("createProducts() method is not implemented yet.");
    }
    //overload changes the parameters of the  and override from the parent class
    //contructor creates an object from class
}
