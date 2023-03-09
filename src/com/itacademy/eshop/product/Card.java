package com.itacademy.eshop.product;

public class Card extends Payment {

    private String cardHolder;
    private int cardNumber;

    public Card(String paymentMethod, double amount, String cardHolder, int cardNumber){
        super(paymentMethod, amount);
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    @Override
    public void processPayment(){
        System.out.println("Your payment of " + getAmount() + " has been processed");
    }
}
