package com.itacademy.eshop.services;

import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.ClothingSize;
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
        ArrayList<Product> productArrayList = new ArrayList<>();
        Product book1 = new Book("Book", 10, Category.BOOKS, "B. Author");
        Product clothing = new Clothing("T-shirt", 12, Category.CLOTHING, "Blue", "T-shirt", ClothingSize.L);
        Product dellComputer = new Computer("Dell computer", 500, Category.ELECTRONICS, "220", "Dell", "Intel", 8);
        Product samsungTV = new TV("Samsung TV", 449, Category.ELECTRONICS, "220", "Samsung", 22, "Pink");
        Product foodItem = new Food("Apple", 2, Category.FOOD, 59);
        Product toy = new Toy("Teddy", 25, Category.TOYS, "Teddy Bear");

        productArrayList.add(book1);
        productArrayList.add(clothing);
        productArrayList.add(dellComputer);
        productArrayList.add(samsungTV);
        productArrayList.add(foodItem);
        productArrayList.add(toy);

        return productArrayList;
    }

}
