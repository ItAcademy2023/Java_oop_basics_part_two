package com.itacademy.eshop.product;

public class Checkout extends Payment {


    boolean paymentProcessing;


    public Checkout(String cardNumber, String nameOnCard, int pin, String email) {
        super(cardNumber, nameOnCard, pin, email);
    }


    @Override
    public String processPayment(double amount) {
        if ((cardNumber.length() == 14) && (pin == 3)) {
            paymentProcessing = true;
            return "Successful payment with amount: " + amount + "Confirmation sent to " + getEmail();
        }
        return " Wrong data";
    }
}
