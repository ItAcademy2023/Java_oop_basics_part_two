package com.itacademy.eshop.shop;

public abstract class Payment {

    private String name;
    private String date;
    private String status;

    public Payment(String name, String date, String status) {
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void showPaymentInfo() {
        System.out.println("Payment " + getName() +
                " " + getDate() + " is now " + getStatus() + ".");
    }

    public String findStatus() {
        if (this.status == null) {
            System.out.println("no status found");
        }
        return getStatus();
    }

    public abstract double processPayment(double amount, double taxes);
}
