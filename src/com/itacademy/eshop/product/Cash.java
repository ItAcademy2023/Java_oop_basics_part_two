package com.itacademy.eshop.product;

public class Cash extends Payment {

    private double cash;
    public Cash(String cardName, String cardNumber) {
        super(cardName, cardNumber);
        this.cash = cash;
    }

    @Override
    public double processPayment(double d1, double d2, double d3) {
        return d1 +d2 +d3 ;
    }
}
