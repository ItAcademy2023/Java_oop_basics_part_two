package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

//display more specific
public abstract class Payment {

    private double taxes;
    private String method;

    public Payment( double taxes, String method) {

        this.taxes = taxes;
        this.method = method;
    }

    public double getTaxes() {
        return taxes;
    }
/**
 * Create an abstract class called payment with abstract method processPayment().
 * Add some fields and methods to it.*/
    public abstract double processPayment(double d1,
                                          double d2,
                                          double d3);

    public String getMethod() {
        return method;
    }

    public abstract void displayProductInfo();

    public abstract void printOutTotalPrice();
}
