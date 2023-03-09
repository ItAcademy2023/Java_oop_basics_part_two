package com.itacademy.eshop.product;

public class CardPayment extends Payment{

    @Override
    public void processPayment() {
        System.out.println("Credit card was provided");
    }
}
