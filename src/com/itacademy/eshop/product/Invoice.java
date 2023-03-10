package com.itacademy.eshop.product;

public class Invoice extends Payment {

    boolean paymentSuccessful;

    public Invoice(String cardNumber, String nameOnCard, int pin,  String email) {
        super(cardNumber, nameOnCard, pin, email);
    }


    @Override
    public String processPayment(double amount) {
        if(!paymentSuccessful){
            System.out.println("Try one more time!");
        }
        return "Payment for amount " + amount + " was successful!";
    }
}
