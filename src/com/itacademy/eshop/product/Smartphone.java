package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.interfaces.Warranty;
import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics implements Warranty {
    private String chargingMethod;
    public Smartphone(String name, double price, Category category, String voltage, String brand,String chargingMethod) {
        super(name, price, category, voltage, brand);
        this.chargingMethod = chargingMethod;
    }

    public String getChargingMethod(){
        return chargingMethod;
    }


    @Override
    public void displayProductInfo() {

    }

    @Override
    public void displayProductImage() {

    }

    @Override
    public double countWarrantyExtendTime() {
        return 0;
    }
}
