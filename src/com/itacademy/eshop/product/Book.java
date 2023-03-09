package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.AgeRestricted;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Genre;

public class Book extends Product implements AgeRestricted {

    private Genre genre;
    private int minimumAge;

    public Book(String name, double price, Category category, Genre genre) {
        super(name, price, category);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void setDiscountedPrice() {
        super.setPrice(super.getPrice() * 0.8);
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "\nPrice: " + getPrice() +
                        "\nCategory: " + getCategory() +
                        "\nGenre: " + getGenre()
        );
    }

    @Override
    public void setMinimumAge() {
        switch (getGenre())    {
            case FAIRYTALE:
                this.minimumAge = 0;
                break;
            case FANTASY:
                this.minimumAge = 7;
                break;
            case ROMANCE:
                this.minimumAge = 13;
                break;
            case MYSTERY:
                this.minimumAge = 15;
                break;
            case HORROR:
                this.minimumAge = 17;
                break;
        }
    }
}
