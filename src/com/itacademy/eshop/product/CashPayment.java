package com.itacademy.eshop.product;

public class CashPayment extends Payment{

    private int cash;

    public CashPayment(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void processPayment() {
        if (getCash()> 100){
            setPaymentSucceeded(true);
            paymentSucceededOutput();
        }else{
            setPaymentSucceeded(false);
            paymentSucceededOutput();
        }
    }
}
