package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Seasons;

public abstract class Clothing extends Product {
    private int forAge;
    private Seasons seasons;
    private String type;

    public Clothing(String name, double price, Category category, String type, int forAge, Seasons seasons) {
        super(name, price, category);
        this.type = type;
        this.forAge = forAge;
        this.seasons = seasons;

    }

    public Seasons getSeason() {
        return seasons;
    }

    public int getForAge() {
        return forAge;
    }

    public String getType() {
        return type;
    }
}