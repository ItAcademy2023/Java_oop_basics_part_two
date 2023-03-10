package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Computer extends Electronics implements Discountable {
    /** Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
    */
    private final String processor;
    private final int ram;

    public Computer(String name, double price, Category category, int ProductIdentifier, String voltage, String brand, String processor, int ram) {
        super(name, price, category, ProductIdentifier, voltage, brand);
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
//displaying the product information on the console using the getter methods for it(from the parent classes (extends) Electronics (extends) Products)

        //from Products class
        System.out.println("Product name: " +getName());
        System.out.println("Product category: " +getCategory());
        System.out.println("Product review: " +getReviews());
        System.out.println("Product Price: " +getPrice());
        System.out.println("Product Identifier: " +getProductIdentifier());

        //from Electronics class
        System.out.println("Product Electronics voltage: " +getVoltage());
        System.out.println("Product Electronics Brand: " +getBrand());

        //from the child class : Computer
        System.out.println("Product Computer Processor : " +this.processor);
        System.out.println("Product Computer ram : " +this.ram);
    throw new UnsupportedOperationException("displayProductInfo() method is not implemented yet.");
    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }
}