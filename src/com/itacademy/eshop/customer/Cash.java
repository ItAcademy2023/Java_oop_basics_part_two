package com.itacademy.eshop.customer;

import com.itacademy.eshop.customer.types.Currency;
import com.itacademy.eshop.shop.ShoppingCart;

public class Cash extends Payment{
    private Currency currency;

    public Cash(String personName, String personSurname, int paymentSize, Currency currency) {
        super(personName, personSurname, paymentSize);
        this.currency = currency;
    }

    @Override
    public void processPayment(ShoppingCart shoppingCart) {
        int newBalance = this.getBalance() - shoppingCart.getTotalPrice();
        if (newBalance >= 0) {
            System.out.println("After transaction your balance is " + newBalance + " " + currency.toString() + ".");
        } else {
            System.out.println("Transaction was canceled, because you are broke. You were short "
                    + (-1 * newBalance) + " " + currency.toString() + ".");
        }
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

}
