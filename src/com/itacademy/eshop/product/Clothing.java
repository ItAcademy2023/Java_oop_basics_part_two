package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Warnings;
import com.itacademy.eshop.product.types.Category;


public class Clothing extends Product implements Warnings {

    String brand;
    String size;
    String material;

    public Clothing(String name, double price, Category category, String brand, String size, String material) {
        super(name, price, category);
       this.brand = brand;
       this.size = size;
       this.material = material;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Product name: " + getName() + ";  price: " + getPrice() + ";  product category: " + getCategory()
                + ";  brand " + brand + ";  size: " +size
        );
    }

    @Override
    public void displayProductReview() {

    }

    @Override
    public void isKidSafe() {
        if(material.equals("plastic")){
            System.out.println("Contains plastic, keep away from fire and kids");
        }
    }
}
