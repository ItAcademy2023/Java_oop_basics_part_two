package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.types.Category;

public abstract class Clothing extends Product implements Returnable {

    String size;
    public Clothing(String name, double price, Category category, String size) {
        super(name, price, category);
        this.size = size;
    }

    public String getSize() { return this.size; }
}
