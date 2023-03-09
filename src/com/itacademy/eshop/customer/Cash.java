package com.itacademy.eshop.customer;

import com.itacademy.eshop.customer.types.Currency;

public class Cash extends Payment{
    private Currency currency;

    public Cash(String personName, String personSurname, int paymentSize, Currency currency) {
        super(personName, personSurname, paymentSize);
        this.currency = currency;
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println(this.getPersonName() + " used cash witch currency was " + currency.toString());
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
