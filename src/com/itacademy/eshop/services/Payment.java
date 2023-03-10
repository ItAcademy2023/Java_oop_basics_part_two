package com.itacademy.eshop.services;

public abstract class Payment {
    double paymentAmount;
    boolean paymentConfirmed = false;

    public abstract void makePayment();

    public abstract void processPayment();

    public Payment(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
