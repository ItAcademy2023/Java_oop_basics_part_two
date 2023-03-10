package com.itacademy.eshop.product;

public abstract class Payment {
    private String cardName;
    private String cardNumber;

    public Payment(String cardName, String cardNumber){
        this.cardNumber = cardNumber;
        this.cardName = cardNumber;
    }
    public abstract double processPayment(double d1, double d2,double d3);

}
