package com.itacademy.eshop.product;

public abstract class Payment {

    private boolean paymentSucceeded;

    public boolean isPaymentSucceeded() {
        return paymentSucceeded;
    }

    public void setPaymentSucceeded(boolean paymentSucceeded) {
        this.paymentSucceeded = paymentSucceeded;
    }

    public abstract void processPayment();

    public void paymentSucceededOutput(){

        if(isPaymentSucceeded()){
            System.out.println("Payment succeeded");
        } else{
            System.out.println("Payment unsuccessful");
        }
    }
}
