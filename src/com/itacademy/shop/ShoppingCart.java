package com.itacademy.shop;

import com.itacademy.product.Product;

import java.util.List;

public class ShoppingCart {

    String totalPrice;
    List<Product> products;

    public ShoppingCart(String totalPrice, List<Product> products) {
        this.totalPrice = totalPrice;
        this.products = products;
    }
}
