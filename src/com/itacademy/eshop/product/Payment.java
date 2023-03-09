package com.itacademy.eshop.product;

public abstract class Payment {

    private double amount;
    private String date;

    public Payment(double amount, String date) {
        this.amount = amount;
        this.date = date;
    }
    abstract void processPayment();

    public double getAmount(){
        return amount;
    }

    public String getDate() {
        return date;
    }
}
