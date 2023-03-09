package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.AgeRestricted;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.ToyType;

public class Toy extends Product implements AgeRestricted {

    private ToyType toyType;
    private int minimumAge;

    public Toy(String name, double price, Category category, ToyType toyType) {
        super(name, price, category);
        this.toyType = toyType;
    }

    public ToyType getToyType() {
        return toyType;
    }

    @Override
    public void setDiscountedPrice() {
        super.setPrice(super.getPrice() * 0.85);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "\nPrice: " + getPrice() +
                        "\nCategory: " + getCategory() +
                        "\nToy type: " + getToyType()
        );
    }

    @Override
    public void setMinimumAge() {
        switch (getToyType()) {
            case DOLLS:
                this.minimumAge = 1;
                break;
            case GAMES:
                this.minimumAge = 3;
            case PUZZLES:
                this.minimumAge = 7;
        }
    }
}

