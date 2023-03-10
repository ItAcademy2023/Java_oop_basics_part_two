package com.itacademy.eshop.services;

public class CardPayment extends Payment{

    public CardPayment(double paymentAmount) {
        super(paymentAmount);
    }
    @Override
    public void makePayment() {
        System.out.println("making payment with card...");
        this.paymentConfirmed = true;
    }
    @Override
    public void processPayment() {
        if (this.paymentConfirmed) {
            System.out.println("payment processed!");
        }
    }
}
