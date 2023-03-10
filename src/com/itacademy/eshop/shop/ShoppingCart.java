package com.itacademy.eshop.shop;

import com.itacademy.eshop.exceptions.ProductNotFoundException;
import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.payment;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    //new payment
    ArrayList<payment> payments;

    public ShoppingCart() {
        this.products = new ArrayList<>();

        //payment constructor
        this.payments = new ArrayList<>();
    }

    public void printShoppingCart() {
        for (Product product : products) {
            product.displayProductInfo();
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    // to display te payment receipts
    public void paymentReceipt(){
        for(payment payment : payments){
            payment.displayPaymentReceipt();
        }
        System.out.println("All payment receipts: " + getTotalReviews());
    }



    public String getTotalReviews(){
        //prints all the reviews
        String paymentReceipt = "";
        for(payment payment: payments){
            paymentReceipt = payment.getPaymentName();

        }
        return paymentReceipt;
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
