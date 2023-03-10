package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Expirable;
import com.itacademy.eshop.product.types.Category;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Food extends Product implements Expirable {
    private double grossWeight;
    private String expiryDate;

    public Food(String name, double price, Category category, double grossWeight, String expiryDate) {
        super(name, price, category);
        this.expiryDate = expiryDate;
        this.grossWeight = grossWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }
    @Override
    public double calculateDaysTillExpiration() {
        LocalDate d1 = LocalDate.parse(expiryDate, DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(LocalDate.now(), d1.atStartOfDay());
        return diff.toDays();
    }
}
