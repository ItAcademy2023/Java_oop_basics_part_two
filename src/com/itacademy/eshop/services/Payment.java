package com.itacademy.eshop.services;


public abstract class Payment {
    private String userName;
    private double id;
    private boolean canMakePayment;


    public Payment(String userName, double id, boolean canMakePayment) {
        this.userName = userName;
        this.id = id;
        this.canMakePayment = canMakePayment;
    }

    public String getUserName() {
        return userName;
    }

    public double getId() {
        return id;
    }
    public boolean getCanMakePayment() {
        return canMakePayment;
    }


    public abstract void displayUserInfo();

    public abstract void processPayment();

}
