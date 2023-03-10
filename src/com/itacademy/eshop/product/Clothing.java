package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class  Clothing extends Product {

    private String colour;
    private String size;
    public Clothing(String name, double price, Category category, String colour, String size ) {
        super(name, price, category);
        this.colour = colour;
        this.size =size;
    }
    public String getSize(){
        return size;
    }
    public String getColour(){
        return colour;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name"+ getName()
        );
    }
}
