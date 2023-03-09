package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
public abstract class Payment {
    private String paymentMethod;
    private double amount;


    public Payment(String paymentMethod, double amount){
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();
}
