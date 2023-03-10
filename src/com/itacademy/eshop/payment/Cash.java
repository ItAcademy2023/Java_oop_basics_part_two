package com.itacademy.eshop.payment;

import com.itacademy.eshop.product.types.Currency;

public abstract class Cash extends Payment{
    private Currency currency;
    private double change;
    private double amountGiven;
    public Cash (Currency currency, double change,double amountGiven, double amount, boolean isCompleted, String ID){
        super(amount, isCompleted, ID);
        this.currency = currency;
        this.change = change;
        this.amountGiven = amountGiven;
    }

    public double getChange(){
        return amountGiven - getAmount();
    }
    public double getAmountGiven(){
        return amountGiven;
    }
    public Currency getCurrency(){
        return getCurrency();
    }
    public double exchangeCurrency(Currency currency) {
        Currency current = getCurrency();
        double currentAmount = 0;
        switch (current){
            case EUR:
                if(currency == Currency.YEN){
                    currentAmount = getAmount() * 145.02d;
                } else if(currency == Currency.USD){
                    currentAmount = getAmount() * 1.06d;
                } else{
                    break;
                }
                break;
            case YEN:
                if(currency == Currency.EUR){
                    currentAmount = getAmount() / 0.0069d;
                } else if(currency == Currency.USD){
                    currentAmount = getAmount() / 0.0073d;
                } else{
                    break;
                }
                break;
            case USD:
                if(currency == Currency.YEN){
                    currentAmount = getAmount() * 136.83;
                } else if(currency == Currency.EUR){
                    currentAmount = getAmount() * 0.94;
                } else{
                    break;
                }
                break;
            default:
                break;
        }
    return currentAmount;
    }
    @Override
    public void processPayment(){
        if(getChange() < 0d){
            throw new UnsupportedOperationException("Not enough money paid");
        } else{
            setCompleted(true);
        }

    }
}
