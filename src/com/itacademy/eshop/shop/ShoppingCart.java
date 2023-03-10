package com.itacademy.eshop.shop;

import com.itacademy.eshop.exceptions.ProductNotFoundException;
import com.itacademy.eshop.product.Product;
import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;
    private int avgPriceOfItemsInCart; // int due to getTotalPrice() returning Integer
    private boolean avgPriceCalculated = false; // no reason to have it other than for task no. 1 in encap

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void printShoppingCart() {
        for (Product product : products) {
            product.displayProductInfo();
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    public Integer getTotalPrice() {
        /**
         * Calculates total price of shopping cart
         */
        int totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    // this would make more sense to just return the avg price
    // but is a setter for the sake of task no. 1 in encapsulation
    public void setAvgPriceOfItems(){
        avgPriceOfItemsInCart = getTotalPrice()/products.size();
        avgPriceCalculated = true;
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

    public Product getProductByName(String name) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new ProductNotFoundException("Product " + name + " was not found");
    }
}
