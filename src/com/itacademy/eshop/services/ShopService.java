package com.itacademy.eshop.services;

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
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        return new ArrayList<>() {
            {
                add(new Product("product one", 10, Category.BOOKS));
                add(new Product("product two", 20, Category.CLOTHING));
                add(new Product("product three", 30, Category.ELECTRONICS));
                add(new Product("product four", 40, Category.FOOD));
                add(new Product("product five", 50, Category.TOYS));
                add(new Product("product six", 60, Category.FOOD));
            }
        };
    }

}
