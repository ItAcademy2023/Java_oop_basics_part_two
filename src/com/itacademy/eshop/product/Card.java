package com.itacademy.eshop.product;

public class Card extends Payment {

    private int cardNumber;
    private String cardHolderName;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Card Payment " +
                "\nPayment ID: " + getPaymentID()+
                "\nCardHolder name: " + getCardHolderName()+
                "\nCard number: " + getCardNumber()
        );
    }
}