package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.interfaces.PayableByInstallments;
import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public class Computer extends Electronics implements Discountable, PayableByInstallments {
    /** Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
    */
    private String processor;
    private int ram;
    ArrayList<Product> products;

    public Computer(String name, double price, Category category, String voltage, String brand, String processor, int ram) {
        super(name, price, category, voltage, brand);
        this.processor = processor;
        this.ram = ram;
        this.products = new ArrayList<>();
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    /** This annotation indicates that the getPrice() method is being overridden from the parent class.*/
    @Override
    public double getPrice() {
        /**
         * getPrice is an example of polymorphism: it overrides the getPrice method defined in Product,
         * allowing for custom pricing for computers
         */
        return super.getPrice() * 1.2;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Processor: " + getProcessor());
    }

    @Override
    public void displayAdditionalInfo() {

    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }

    @Override
    public boolean payInInstallments() {
        return true;
    }
}