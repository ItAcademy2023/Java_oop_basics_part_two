package com.itacademy.eshop.product.types;


//additional class which extends from payment and implements the interface of Promotional
import com.itacademy.eshop.interfaces.Promotional;

public class paymentDescription extends payment implements Promotional {
    private String paymentTag;

    public paymentDescription(int id, int paymentPrice, String paymentName, String paymentTag){
        super(id, paymentPrice, paymentName, paymentTag);
        this.paymentTag = paymentTag;
    }

    public String getPaymentTag(){
        return paymentTag;
    }

    @Override
    public void displayPaymentReceipt() {
        System.out.println("payment price : " +getPaymentPrice());
        System.out.println("payment Name : " +getPaymentName());
        System.out.println("payment Tag Description: " +getPaymentTag());

    }


    @Override
    public int promotionalProposedPrice() {
        return 0;
    }
}
