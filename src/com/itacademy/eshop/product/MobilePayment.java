package com.itacademy.eshop.product;

public class MobilePayment extends Payment {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    void processPayment() {
        System.out.println(
                "Mobile payment" +
                        "Payment ID: " + getPaymentID() +
                        "Phone number: " + getPhoneNumber()
        );
    }


}