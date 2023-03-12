package com.itacademy.eshop.payments;

public class MobilePayment extends Payment {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    void processPayment() {
        System.out.println(
                "Processing mobile payment..." +
                        "Payment ID: " + getPaymentID() +
                        "Phone number: " + getPhoneNumber()
        );
    }
}
