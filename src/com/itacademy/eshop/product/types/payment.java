package com.itacademy.eshop.product.types;

import com.itacademy.eshop.product.paymentReview;

import java.util.ArrayList;

public abstract class payment {
    private int id;
    private int paymentPrice;
    private String paymentName;

    private ArrayList<paymentReview> paymentReviewArrayList;


    public payment (int id, int paymentPrice, String paymentName, String paymentTag){
        this.id = id;
        this.paymentPrice = paymentPrice;

        this.paymentName = paymentName;
    }


    public int getId (){
        return id;
    }
    public int getPaymentPrice (){
        return paymentPrice;
    }
    public String getPaymentName (){
        return paymentName;
    }



    public ArrayList<paymentReview> getPaymentReviewArrayList (){
        return paymentReviewArrayList;
    }

    public abstract void displayPaymentReceipt();

}
