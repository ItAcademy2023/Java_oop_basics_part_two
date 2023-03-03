package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
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
        throw new UnsupportedOperationException("createShop() is not implemented yet");
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        throw new UnsupportedOperationException("createProducts() is not implemented yet");
    }

}
