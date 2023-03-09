package com.itacademy.eshop.product;

import com.itacademy.eshop.services.Payment;

public class Admin extends Payment {


    public Admin(String userName, double id, boolean canMakePayment) {
        super(userName, id, canMakePayment);
    }

    @Override
    public void displayUserInfo() {
        System.out.println("I am Admin");
    }

    @Override
    public void processPayment() {
        System.out.println("I do not need to pay, payment is processed");
    }
}
