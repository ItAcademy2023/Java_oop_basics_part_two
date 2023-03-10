package com.itacademy.eshop.product;

public class Card extends Payment {
    public String cardType;

    public Card(String cardName, String cardNumber) {
        super(cardName, cardNumber);
        this.cardType = cardType;
    }

    @Override
    public double processPayment(double d1, double d2, double d3) {
        return d1 + d2 + d3;
    }
}
