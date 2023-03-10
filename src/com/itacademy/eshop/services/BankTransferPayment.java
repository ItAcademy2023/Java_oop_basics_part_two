package com.itacademy.eshop.services;

public class BankTransferPayment extends Payment {
    public BankTransferPayment(double paymentAmount) {
        super(paymentAmount);
    }

    @Override
    public void makePayment() {
        System.out.println("making payment via bank transfer...");
        this.paymentConfirmed = true;
    }
    @Override
    public void processPayment() {
        if (this.paymentConfirmed) {
            System.out.println("payment processed!");
        }
    }
}
