package com.itacademy.eshop.payment;

public abstract class Card extends Payment {
    private String type;
    private String cardProvider;
    private boolean isCardDeclined;
    public Card (String type, String cardProvider,boolean isCardDeclined, double amount, boolean isCompleted, String ID){
        super(amount, isCompleted, ID);
        this.type = type;
        this.cardProvider = cardProvider;
        this.isCardDeclined = isCardDeclined;
    }
    public String getType(){
        return type;
    }
    public String getCardProvider(){
        return cardProvider;
    }

    public boolean isCardDeclined() {
        return isCardDeclined;
    }
    @Override
    public void processPayment(){
        if(isCardDeclined){
            throw new UnsupportedOperationException("Card was declined");
        }else{
            setAmount(getAmount() + 0.02);
            setCompleted(true);
        }
    }
}
