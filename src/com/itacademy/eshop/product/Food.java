package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {
    private String countryOrigin;


    public Food(String name, double price, Category category, String countryOrigin) {
        super(name, price, category);
        this.countryOrigin = countryOrigin;
    }

    public String getCountryOrigin(){
        return countryOrigin;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Category"+getCategory()
        );
    }
}

