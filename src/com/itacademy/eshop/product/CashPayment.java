package com.itacademy.eshop.product;

public class CashPayment extends Payment {

    @Override
    public void processPayment() {
        System.out.println("Cash was provided");
    }
}
