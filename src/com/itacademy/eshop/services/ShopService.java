package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Book;
import com.itacademy.eshop.product.Clothing;
import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Smartphone;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;

import static com.itacademy.eshop.product.types.Category.*;

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


        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Book("Book", 10, BOOKS);
        products.add(product1);

        Product product2 = new Smartphone("product one", 1000, ELECTRONICS, "500", "Apple");
        products.add(product2);

        Product product3 = new Clothing("product two", 9, CLOTHING);
        products.add(product3);

        Product product4 = new Clothing("Shirt", 9, CLOTHING);
        products.add(product4);

        Product product5 = new Clothing("Shirt", 9, CLOTHING);
        products.add(product5);

        /**
         * Should return a list of products. Should contain at least 6 products,
         * Each product must be different class. For example: Computer, Shirt etc.
         * Each class must extend AbstractProduct class.
         * So you will have to create at least 6 classes that extend Product class.
         */
//        throw new UnsupportedOperationException("createProducts() method is not implemented yet.");

        return products;
    }

}
