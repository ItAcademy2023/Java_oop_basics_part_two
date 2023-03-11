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
        ArrayList<Product> arrayList = new ArrayList<>();

        Computer computer = new Computer
                ("MyDell", 150, Category.ELECTRONICS, "123", "brand", "intel", 16);
        Tv myTv = new Tv
                ("FavoriteTv", 568, Category.ELECTRONICS, "240", "Samsung", "retina", 7);
        Dress dress = new Dress
                ("Mini", 25.5, Category.CLOTHING, "red", "velvet", "M", 90);
        Milk cow = new Milk
                ("Karvute", 5.69, Category.FOOD, "2023-03-30", "Lithuania", "paper");

        return arrayList;

    }
}
