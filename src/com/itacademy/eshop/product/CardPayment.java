package com.itacademy.eshop.product;

public class CardPayment extends Payment{
    public CardPayment(double amount, String date) {
        super(amount, date);
    }

    @Override
    void processPayment() {
        System.out.println("Card was accepted!");
    }
}
