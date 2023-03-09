package com.itacademy.eshop.product;

import com.itacademy.eshop.shop.ShoppingCart;

public abstract class Card extends Payment {

    private String cardNumber;
    private String cardHolder;
    private String expirationDate;
    private int cvvNumber;

    public Card(String paymentMethod, double amount, String cardNumber, String cardHolder, String expirationDate, int cvvNumber) {
        super(paymentMethod, amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.cvvNumber = cvvNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    @Override
    public void processPayment(ShoppingCart shoppingCart) {
        if (getAmount() - shoppingCart.getTotalPrice() > 0) {
            //Implement card validation
            System.out.println("Payment was successful");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
