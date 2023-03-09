package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public abstract class Food extends Product {
    public Food(String name, double price, Category category) {
        super(name, price, category);
    }

    public void displayProductInfo() {
        System.out.println(
                "Name" + this.getName() +
                        "\nPrice" + this.getPrice() +
                        "\nCategory: " + this.getCategory()
        );
    }
    public void displayProductInfo(int extension) {
        if (extension == 1) {
            System.out.println(
                    "Name" + this.getName()
            );
        }
        if (extension == 2){
            System.out.println(
                    "Name" + this.getName() +
                            "\nPrice" + this.getPrice()
            );
        }
    }

}
