package com.itacademy.eshop.product;

import com.itacademy.eshop.shop.ShoppingCart;

public abstract class Cash extends Payment {

    private String currency;
    private double change;

    public Cash(String paymentMethod, double amount, String currency, double change) {
        super(paymentMethod, amount);
        this.currency = currency;
        this.change = change;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    @Override
    public void processPayment(Integer totalPrice) {
        if (getAmount() - totalPrice > 0) {
            setChange(getAmount() - totalPrice);
            System.out.println("Payment was successful. Change is: " + getChange());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
