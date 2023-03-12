package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Tales extends Books {

    private String field;

    public Tales(String name, double price, Category category, int pages, String author, String field) {
        super(name, price, category, pages, author);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public void displayProductCategory() {
        System.out.println("Tales are: " + getCategory());
    }
}
