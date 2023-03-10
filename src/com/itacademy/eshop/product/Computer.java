package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Computer extends Electronics implements Discountable {
    /** Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
    */
    private String processor;
    private int ram;

    public Computer(String name, double price, Category category, String voltage, String brand, String processor, int ram) {
        super(name, price, category, voltage, brand);
        this.processor = processor;
        this.ram = ram;
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
        System.out.println("Product name: " + getName() + ";  price: " + getPrice() + ";  product category: " + getCategory() +
                ";  voltage: " + getVoltage() + ";  brand: " + getBrand() + ";  processor: " + getProcessor() + ";  ram: " + getRam());
    }

    @Override
    public void displayProductReview() {
        System.out.println(
               getReviews()
        );
    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.2;
    }

    @Override
    public double calculateDiscountedPrice(boolean isRegularCustomer) {
        double newPrice = 0;
        if(isRegularCustomer){
           newPrice = getPrice() * 0.5;
        }
       return newPrice;
    }

    @Override
    public double calculateDiscountedPrice(boolean isRegularCustomer, boolean referredFriend) {
        double newPrice = 0;
        if(isRegularCustomer && referredFriend){
            newPrice = getPrice() * 0.9;
        }
        return newPrice;
    }



}