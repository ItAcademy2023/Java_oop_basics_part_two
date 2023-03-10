package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Available;
import com.itacademy.eshop.product.types.Category;

public abstract class Toy extends Product implements Available {
        private boolean isPlushy;
    private boolean isAvailable;
        public Toy (boolean isPlushy, String name, double price, Category category) {
            super(name, price, category);
            this.isPlushy = isPlushy;
        }

        public boolean getIsPlushy(){
            return isPlushy;
        }
        public boolean getIsAvailable(){
            return isAvailable;
        }
        public void setIsPlushy(boolean newIsPlushy){
            isPlushy = newIsPlushy;
        }
        @Override
        public boolean updateAvailability(){
            return !getIsAvailable();
        }
        @Override
        public void displayProductInfo() {
            System.out.println(
                    "Name: " + getName()
                            + "Price: " + getPrice()
                            + "Category: " + getCategory()
                            + "Is Toy plushy " + getIsPlushy()
                            + "Is Toy Available " + getIsAvailable()

            );
        }
}

