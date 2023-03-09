package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.interfaces.Returnable;
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
        throw new UnsupportedOperationException("displayProductInfo() method is not implemented yet.");
    }

    @Override
    public void displayProductColor() {
        System.out.println("Product color is black!");
    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }

    @Override
    public String returnProduct() {
        return "This product can be returned for 2 years";
    }
}