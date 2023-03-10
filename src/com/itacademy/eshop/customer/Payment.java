package com.itacademy.eshop.customer;

import com.itacademy.eshop.shop.ShoppingCart;

public abstract class Payment {
    private String personName;
    private String personSurname;
    private int balance;

    public Payment(String personName, String personSurname, int balance) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.balance = balance;
    }

    public abstract void processPayment(ShoppingCart shoppingCart);

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public int getBalance() {
        return balance;
    }

    public void setPaymentSize(int balance) {
        this.balance = balance;
    }
}
