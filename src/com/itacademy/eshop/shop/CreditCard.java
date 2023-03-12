package com.itacademy.eshop.shop;

public class CreditCard extends Payment {


    public CreditCard(String name, String date, String status) {
        super(name, date, status);
    }

    @Override
    public double processPayment(double amount, double taxes) {
        return amount + (0.75 * taxes) + 0.46;
    }
}
