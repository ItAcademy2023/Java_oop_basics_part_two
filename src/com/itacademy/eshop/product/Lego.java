package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Lego extends Toy{
    private double size;

    public Lego(boolean isPlushy, String name, double price, Category category, double size) {
        super(isPlushy, name, price, category);
        this.size = size;
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void changeProductName(String newName) {
        setName(newName);
    }
    @Override
        public void displayProductInfo() {
            System.out.println(
                    "Name: " + getName()
                            + "Price: " + getPrice()
                            + "Category: " + getCategory()
                            + "Is Toy plushy " + getIsPlushy()
                            + "Is Toy Available " + getIsAvailable()
                    + "Toy size: " + getSize()

            );
    }
}
