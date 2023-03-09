package com.itacademy.eshop.product;

import com.itacademy.eshop.services.Payment;

public class NormalUser extends Payment {
    public NormalUser(String userName, double id, boolean canMakePayment){
        super(userName,id,canMakePayment);
    }

    @Override
    public void displayUserInfo() {
        System.out.println("I am just a normal user :(");
    }

}
