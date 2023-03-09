package com.itacademy.eshop.product;

public class CashPayment extends Payment{
    public CashPayment(double amount, String date) {
        super(amount, date);
    }

    @Override
    void processPayment() {
        System.out.println("Cash has been handed!");
    }
}
