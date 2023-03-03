package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

public class ShoppingCart {
    Product[] products;

    public ShoppingCart() {
        this.products = new Product[]{};
    }

    public void printShoppingCart() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    public String getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
        throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");
    }
}
