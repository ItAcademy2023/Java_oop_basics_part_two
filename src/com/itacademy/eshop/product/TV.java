package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.types.Category;

public abstract class TV extends Electronics implements Discountable, Returnable {

    public TV(String name, double price, Category category, String voltage, String brand) {
        super(name, price, category, voltage, brand);
    }
}
