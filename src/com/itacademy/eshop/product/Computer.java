package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Computer extends Electronics implements Discountable {
    /**
     * Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
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

    public String getCpuAndRam() {
        return processor + ram;
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

    public double getPrice(double discount) {
        return super.getPrice() * discount;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Category:" + getCategory() +
                        "Volatge:" + getVoltage() +
                        "Price" + getPrice()
        );
    }

    @Override
    public void displayProductImage() {

    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }


}