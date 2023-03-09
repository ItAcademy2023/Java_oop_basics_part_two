package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics implements Discountable, Returnable {

    private String condition;
    public Smartphone(String name, double price, Category category, String voltage, String brand, String condition) {
        super(name, price, category, voltage, brand);
        this.condition = condition;
    }

    public String getCondition() { return this.condition; }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.9;
    }

    @Override
    public String returnProduct() {
        return "Product can be returned for 2 months";
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Price : " + getPrice());
        System.out.println("Category : " + getCategory());
        System.out.println("Voltage : " + getVoltage());
        System.out.println("Brand : " + getBrand());
        System.out.println("Condition : " + getCondition());
    }

    @Override
    public void displayProductColor() {
        System.out.println("Product is red!");
    }
}
