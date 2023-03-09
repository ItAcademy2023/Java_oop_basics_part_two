package com.itacademy.eshop.product;

public abstract class Payment {
    double totalPrice;

    void getPaymentInfo () {
    }
    abstract void processPayment();
}
