package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class TopClothing extends Clothing{
    private String topType;
    public TopClothing(String name, double price, Category category, String topType, String material) {
        super(name, price, category, material);
        this.topType = topType;
    }
    @Override
    public void displayProductInfo() {
        System.out.printf("Name: %s\n" +
                "Price: %.2f\n" +
                "Type: %s\n" +
                "Material: %s\n", getName(), getPrice(), this.topType, getMaterial());
    }
    @Override
    public void abstractOverridenMethod() {
        throw new UnsupportedOperationException("abstractOverriddenMethod() method is not implemented yet.");
    }
}
