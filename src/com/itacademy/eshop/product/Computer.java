package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Computer extends Electronics implements Discountable {
    /**
     * Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
     */
    private String processor;
    private int ram;

    public Computer(String name, double price, Category category, int voltage, String brand, String processor, int ram) {
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

    /**
     * This annotation indicates that the getPrice() method is being overridden from the parent class.
     */
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

        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Category: " + getCategory() +
                        "Voltage:" + getVoltage() +
                        "Ram: " + getRam() +
                        "Processor: " + getProcessor() +
                        "Brand: " + getBrand()
        );
    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }

    @Override
    public void showOnlyImportant() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Ram: " + getRam() +
                        "Processor: " + getProcessor()
        );
    }
}