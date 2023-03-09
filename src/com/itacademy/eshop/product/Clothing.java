package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Clothing extends Product {

    private int size;

    public Clothing(String name, double price, Category category, int size) {
        super(name, price, category);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void setDiscountedPrice() {
        super.setPrice(super.getPrice() * 0.7);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "\nPrice: " + getPrice() +
                        "\nCategory: " + getCategory() +
                        "\nSize: " + getSize()
        );
    }
}
