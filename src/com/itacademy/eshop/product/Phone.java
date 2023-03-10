package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Phone extends Electronics implements Discountable {
    private String operatingSystem;
    private int dimension;

    public Phone(String name, double price, Category category, int ProductIdentifier, String voltage, String brand,String operatingSystem, int dimension){
        super(name,price,category,ProductIdentifier,voltage,brand);
        this.operatingSystem=operatingSystem;
        this.dimension=dimension;

        }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public int getDimension(){
        return dimension;
    }

    @Override
    public double calculateDiscountedPrice() {
        return 0;
    }

    @Override
    public void displayProductInfo() {

        System.out.println("Product name: " +getName());
        System.out.println("Product category: " +getCategory());
        System.out.println("Product review: " +getReviews());
        System.out.println("Product Price: " +getPrice());
        System.out.println("Product Identifier: " +getProductIdentifier());

        //from Electronics class
        System.out.println("Product Electronics voltage: " +getVoltage());
        System.out.println("Product Electronics Brand: " +getBrand());

        //from the child class : Computer
        System.out.println("Product Computer Processor : " +this.operatingSystem);
        System.out.println("Product Computer ram : " +this.dimension);
    }
}
