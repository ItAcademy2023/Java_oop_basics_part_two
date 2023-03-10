package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.ComesInBlackable;
import com.itacademy.eshop.product.types.Category;

public class TV extends Electronics implements ComesInBlackable {
    private int screenSize;
    private String color;

    public TV(String name, double price, Category category, String voltage, String brand, int screenSize, String color) {
        super(name, price, category, voltage, brand);
        this.screenSize = screenSize;
        this.color = color;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("TV name: " + getName());
        System.out.println("Screen size: " + screenSize);
        System.out.println("Color: " + color);
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
    }

    @Override
    public void deleteReviewByAuthor(String author) {
        if (this.getReviews().size() != 0) {
            for (Review review : getReviews()) {
                if (review.getAuthor().equals(author)) {
                    getReviews().remove(review);
                    break;
                }
            }
        }
    }

    @Override
    public void changeColorToBack() {
        this.setColor("Black");
    }
}
