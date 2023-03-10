package com.itacademy.eshop.product;

public class ClassOne extends Payment{
    @Override
    void processPayment() {
        System.out.println("ClassOne extends Payment class!");
    }
}
