package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.ComesInBlackable;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.ClothingSize;

public class Clothing extends Product implements ComesInBlackable {

    private String color;
    private String type;
    private ClothingSize size;

    public Clothing(String name, double price, Category category, String color, String type, ClothingSize size) {
        super(name, price, category);
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Clothing name: " + getName());
        System.out.println("Clothing type: " + type);
        System.out.println("Size: " + size);
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
