package com.itacademy.eshop.product;

public abstract class Payment {

    double totalCost;

    public abstract void processPayment();


    public void displaySum() {
        System.out.println("Total cost is: " + totalCost);
    }

    public void confirmPayment() {
        System.out.println("Press Pay button to confirm payment");
    }
}
