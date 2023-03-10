package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

//display more specific
public class Clothing extends Product {

    private String material;
    private String season;

    public Clothing(String name, double price, Category category, String material, String season) {
        super(name, price, category);
        this.material = material;
        this.season = season;
    }

    public String getMaterial() {
        return material;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                " Material " + getMaterial() +
                        " Season " + getSeason() +
                        " Price " + getPrice()) ;
           }

    @Override
    public void printOutTotalPrice() {
        System.out.println("Total price of Clothing" + getPrice());

    }

    @Override
    public void setDiscountedPrice() {

    }

    @Override
    public double getPrice() {
        /**
         * getPrice is an example of polymorphism: it overrides the getPrice method defined in Product,
         * allowing for custom pricing for computers
         */
        return super.getPrice() * 1.2;// takes price from the parent which is Product
    }
}
