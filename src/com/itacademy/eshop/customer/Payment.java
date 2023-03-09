package com.itacademy.eshop.customer;

public abstract class Payment {
    private String personName;
    private String personSurname;
    private int paymentSize;

    public Payment(String personName, String personSurname, int paymentSize) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.paymentSize = paymentSize;
    }

    public abstract void displayPaymentDetails();

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

    public int getPaymentSize() {
        return paymentSize;
    }

    public void setPaymentSize(int paymentSize) {
        this.paymentSize = paymentSize;
    }
}
