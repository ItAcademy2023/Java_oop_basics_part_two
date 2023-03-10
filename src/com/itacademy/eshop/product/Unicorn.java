package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Unicorn extends Toys {
    private String talkable;

    public Unicorn(String name, double price, Category category, int ageGroup1, String material1, String talkable) {
        super(name, price, category, ageGroup1, material1);
        this.talkable = talkable;

    }

    @Override
    public void printOutTotalPrice() {
    }

    @Override
    public void setDiscountedPrice() {
    }


    @Override
    public String toString(){
        return String.format("sdfghlkjbvrjyhs %s", getName());
    //return getName() + "\n" + getCategory();
    }
}
