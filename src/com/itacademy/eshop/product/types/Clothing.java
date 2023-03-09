package com.itacademy.eshop.product.types;

import com.itacademy.eshop.product.Product;

public class Clothing extends Product {

    private final String color;
    private final String size;

    public Clothing (String name, double price, Category category, String color, String size){
        super(name, price , category);
        this.color = color;
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public String getSize(){
        return size;
    }

    @Override
    public void displayProductInfo() {
        //printing the getter methods of the parent class
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getCategory());

        //printing the getter methods of the child class
        System.out.println(this.color);
        System.out.println(this.size);
        // display the list of the products via Products(parent class) till Clothing(child class) of the implementation
    }
}
