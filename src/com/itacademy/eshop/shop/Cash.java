package com.itacademy.eshop.shop;

public class Cash extends Payment {

    public Cash(String name, String date, String status) {
        super(name, date, status);
    }

    @Override
    public double processPayment(double amount, double taxes) {
        return amount + taxes;
    }
}
