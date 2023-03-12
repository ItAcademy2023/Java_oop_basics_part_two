package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Cars extends Toys {

    private String model;

    public Cars(String name, double price, Category category, String material, String model) {
        super(name, price, category, material);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Cars are: " + getCategory());
    }
}
