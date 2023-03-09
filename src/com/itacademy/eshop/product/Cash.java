package com.itacademy.eshop.product;

public class Cash extends Payment {
    private String fullName;
    private String paymentDate;

    public Cash (String paymentMethod, double amount, String fullName, String paymentDate){
        super(paymentMethod, amount);
        this.fullName = fullName;
        this.paymentDate= paymentDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    @Override
    public void processPayment(){
        System.out.println("Your order will be processed once you make the payment in store on " + getPaymentDate() + ".");
    }
}
