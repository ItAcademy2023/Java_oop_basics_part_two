package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Clothing extends Product{
    private String material;
    private String brand;

    public Clothing (String name, double price, Category category, String material, String brand){
        super(name, price, category);
        this.material = material;
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName()
                        + "Price: " + getPrice()
                        + "Category: " + getCategory()
                        + "Materials: " + getMaterial()
                        + "Brand " + getBrand()

        );
    }
    @Override
    public void changeProductName(String newName){
        setName(newName);
    }
}
