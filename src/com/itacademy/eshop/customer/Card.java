package com.itacademy.eshop.customer;

import com.itacademy.eshop.customer.types.Currency;
import com.itacademy.eshop.shop.ShoppingCart;

public class Card extends Payment{
    private String cardNumber;
    private String cardExpirationDate;
    private Currency currency;

    public Card(String personName, String personSurname, int balance, String cardNumber,
                String cardExpirationDate, Currency currency) {
        super(personName, personSurname, balance);
        this.cardNumber = cardNumber;
        this.cardExpirationDate = cardExpirationDate;
        this.currency = currency;
    }

    @Override
    public void processPayment(ShoppingCart shoppingCart) {
        int newBalance = this.getBalance() - shoppingCart.getTotalPrice();
        if (newBalance >= 0) {
            System.out.println("You used a card with this number: " + cardNumber +
                    ", to make a transaction after which your balance is "
                    + newBalance + " " + currency.toString() + ".");
        } else {
            System.out.println("Transaction was canceled, because you are broke. You were short "
                    + (-1 * newBalance) + " " + currency.toString() + ".");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
