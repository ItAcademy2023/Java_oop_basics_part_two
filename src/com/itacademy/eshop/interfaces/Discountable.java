package com.itacademy.eshop.interfaces;

public interface Discountable {
    double calculateDiscountedPrice();

    double calculateDiscountedPrice(boolean isRegularCustomer);

    double calculateDiscountedPrice(boolean isRegularCustomer, boolean referredFriend);
}
