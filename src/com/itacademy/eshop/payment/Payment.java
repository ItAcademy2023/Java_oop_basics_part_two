package com.itacademy.eshop.payment;

public abstract class Payment {
    private double amount;
    private boolean isCompleted;
    private String ID;

    public Payment (double amount, boolean isCompleted, String ID){
        this.amount = amount;
        this.isCompleted = isCompleted;
        this.ID = ID;
    }
    public double getAmount ()  {
        return amount;
    }
    public boolean getIsCompleted (){
        return isCompleted;
    }
    public String getID(){
        return ID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public abstract void processPayment();
}