package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Returnable;
import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;

public class Book extends Product implements Returnable {

    public Book(String name, double price, Category category) {
        super(name, price, category);
    }

    @Override
    public void displayProductInfo() {
        System.out.println("This is a book");
    }

    @Override
    public void displayProductColor() {

    }

    @Override
    public void returnProduct() {
        System.out.println("Product has been returned and refunded.");
    }


    /**
     *
     * Overloading
     */


    public void displayProductAmount(String customer) {
        System.out.println("One user is allowed to order x amount of product.");
    }

    public void displayProductAmount(String employee, int employeeID) {
        System.out.println("There is x of product in stock.");
    }

}
