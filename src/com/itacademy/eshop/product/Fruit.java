package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Fruit extends Food{
    private String fruitType;
    public Fruit(String name, double price, Category category, double grossWeight, String fruitType) {
        super(name, price, category, grossWeight);
        this.fruitType = fruitType;
    }
    @Override
    public void displayProductInfo() {
        System.out.printf("""
                Name: %s
                Price: %.2f
                Fruit type: %s
                Gross Weight: %.2f""", getName(), getPrice(), this.fruitType, getGrossWeight());
    }
    @Override
    public void abstractOverridenMethod() {
        throw new UnsupportedOperationException("abstractOverriddenMethod() method is not implemented yet.");
    }
}
