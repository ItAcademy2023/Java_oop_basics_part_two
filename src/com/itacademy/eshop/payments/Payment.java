package com.itacademy.eshop.payments;

import java.util.UUID;

public abstract class Payment {

    private final String paymentID;

    public Payment() {
        this.paymentID = UUID.randomUUID().toString();
    }

    // getter method for paymentID
    public String getPaymentID() {
        return paymentID;
    }

    abstract void processPayment();
}
