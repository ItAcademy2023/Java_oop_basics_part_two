package com.itacademy.eshop.customer;

public class Card extends Payment{
    private String cardNumber;
    private String cardExpirationDate;

    public Card(String personName, String personSurname, int paymentSize, String cardNumber,
                String cardExpirationDate) {
        super(personName, personSurname, paymentSize);
        this.cardNumber = cardNumber;
        this.cardExpirationDate = cardExpirationDate;
    }

    @Override
    public void displayPaymentDetails() {
        System.out.println(this.getPersonName() + " used a card with number: " + cardNumber + ".");
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
}
