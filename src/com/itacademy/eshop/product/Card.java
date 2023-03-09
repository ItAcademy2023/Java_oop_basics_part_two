package com.itacademy.eshop.product;

//display more specific
public class Card extends Payment {

    private int number;
    private String name;

    public Card(double taxes, String method, int number, String name) {
        super(taxes, method);
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public double processPayment(double d1, double d2, double d3) {
        return 0;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                " Card Number " + getNumber() +
                        " Childholder name " + getName());

    }

    @Override
    public void printOutTotalPrice() {

    }


}
