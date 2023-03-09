package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Phone extends Electronics{
    private int screenSize;
    private String OS;
    public Phone(String name, double price, Category category, String voltage, String brand, int screenSize, String OS) {
        super(name,price, category, voltage, brand);
        this.screenSize = screenSize;
        this.OS = OS;
    }
    public String getOS(){
        return OS;
    }
    public int getScreenSize(){
        return screenSize;
    }
    public void setOS(String newOS){
        OS = newOS;
    }
    public void setScreenSize(int newScreenSize){
        screenSize = newScreenSize;
    }
    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName()
                        + "Price: " + getPrice()
                        + "Category: " + getCategory()
                        + "Voltage: " + getVoltage()
                        + "Brand: " + getBrand()
                        + "Screen Size: " + getScreenSize()
                        + "OS: " + getOS()
        );
    }
    @Override
    public void changeProductName(String newName){
        setName(newName);
    }
}
