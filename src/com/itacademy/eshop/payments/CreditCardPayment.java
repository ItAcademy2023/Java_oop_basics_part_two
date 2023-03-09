package com.itacademy.eshop.payments;

public class CreditCardPayment extends Payment {

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
        System.out.println("Processing card payment... " +
                "\nPayment ID: " + getPaymentID()+
                "\nCard Holder: " + getCardHolderName()+
                "\nCard number: " + getCardNumber()
        );
    }
}
