package com.itacademy.eshop.product.types;

import com.itacademy.eshop.product.Product;

public class Food extends Product {
    private final String FoodName;
    private final String FoodSize;
    private final int weight;

    public Food (String name, double price, Category category, int ProductIdentifier, String FoodName, String FoodSize, int weight){
        super(name, price, category, ProductIdentifier);
        this.FoodName = FoodName;
        this.FoodSize = FoodSize;
        this.weight = weight;

    }

    public String getFoodName() {
        return FoodName;
    }

    public String getFoodSize() {
        return FoodSize;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void displayProductInfo() {
        // display the list of the products via Products(parent class) till CLothing(child class) of the implementation

        //getter methods of the parent class
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getCategory());
        System.out.println(getProductIdentifier());

        //getter methods of the child class
        System.out.println(this.FoodName);
        System.out.println(this.FoodSize);
        System.out.println(this.weight);

    }
}
