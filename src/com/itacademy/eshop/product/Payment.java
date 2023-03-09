package com.itacademy.eshop.product;

public abstract class Payment {
    String paymentType;
    double paymentAmount;

    public abstract void makePayment();

    public abstract void processPayment();

    public Payment(String paymentType, double paymentAmount) {
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
    }
}
