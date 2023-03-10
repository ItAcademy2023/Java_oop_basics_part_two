package com.itacademy.eshop.product;

public abstract class Payment {

    String email;
    String cardNumber;
    String nameOnCard;
    int pin;

    public Payment(String cardNumber, String nameOnCard, int pin, String email) {
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.pin = pin;
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public int getPin() {
        return pin;
    }

    public abstract String processPayment(double amount);

    public void cardNumberValid() {
    }

}
