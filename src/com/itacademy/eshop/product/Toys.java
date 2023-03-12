package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.PayableByInstallments;
import com.itacademy.eshop.product.types.Category;

public abstract class Toys extends Product implements PayableByInstallments {

    private boolean forChildren;

    public Toys(String name, double price, Category category, boolean forChildren) {
        super(name, price, category);
        this.forChildren = forChildren;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println("Is it for children: " + isForChildren());
    }

    public boolean isForChildren() {
        return forChildren;
    }

    public void setForChildren(boolean forChildren) {
        this.forChildren = forChildren;
    }

    @Override
    public boolean payInInstallments() {
        return false;
    }
}
