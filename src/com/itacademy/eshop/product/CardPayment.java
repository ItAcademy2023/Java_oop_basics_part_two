package com.itacademy.eshop.product;

public class CardPayment extends Payment {

    private int funds;

    @Override
    public void processPayment() {
        if (funds > 100) {
            setPaymentSucceeded(true);
            isPaymentSucceeded();
        } else {
            setPaymentSucceeded(false);
            isPaymentSucceeded();
        }
    }
}
