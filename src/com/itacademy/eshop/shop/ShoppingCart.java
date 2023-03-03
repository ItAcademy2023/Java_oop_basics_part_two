package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void printShoppingCart() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    public Integer getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
        int totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductByName(String shirt) {
        for (Product product : products) {
            if (product.getName().equals(shirt)) {
                products.remove(product);
                break;
            }
        }
    }

    public Product getProductByName(String book) {
        for (Product product : products) {
            if (product.getName().equals(book)) {
                return product;
            }
        }
        return null;
    }
}
