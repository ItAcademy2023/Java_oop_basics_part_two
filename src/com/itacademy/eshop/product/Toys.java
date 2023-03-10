package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

//display more specific
public abstract class Toys extends Product {

    private final String material; // a constant variable
    private final int ageGroup;

        public Toys(String name, double price, Category category, int ageGroup1, String material1) {
        super(name, price, category);
        this.material = material1;
        this.ageGroup = ageGroup1;
    }

    public String getMaterial() {
        return material;
    }

    public int getAgeGroup() {
        return ageGroup;
    }
    @Override
    public void displayProductInfo() {
        System.out.println(
                "\nMaterial" + getMaterial() +
                        "\nAgeGroup" + getAgeGroup());
    }
}
