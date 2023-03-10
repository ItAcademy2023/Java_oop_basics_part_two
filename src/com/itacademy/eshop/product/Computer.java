package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public class Computer extends Electronics implements Discountable {
    /*
     * Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
     */
    private String processor;
    private int ram;

    public Computer(String name, double price, Category category, String voltage, String brand, String processor, int ram) {
        super(name, price, category, voltage, brand);//an object of a computer
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    /**
     * This annotation indicates that the getPrice() method is being overridden from the parent class.
     */


    public double getPrice() {
        /**
         * getPrice is an example of polymorphism: it overrides the getPrice method defined in Product,
         * allowing for custom pricing for computers
         */
        return super.getPrice() * 1.2;// takes price from the parent which is Product
    }

    public Category getCategoryElectronics() {
        return Category.ELECTRONICS;
    }
    //always goes to the closest method, if it is override also


    public ArrayList<Review> getReview() {
        return super.getReviews();
    }
//Overloading
    public ArrayList<Review> getReview(int rating) {
        ArrayList<Review> reviews = new ArrayList<>();
        for (Review review : super.getReviews()) {
            if (review.getRating() >= rating) {
                reviews.add(review);
            }

        }
        return reviews;
    }

    @Override
    public void displayProductInfo() {
/**  getCategoryElectronics();
 *   print all the fiellds
 * main abstract which is on the product class*/
        System.out.println(
                "\nCategory " + getCategory() +
                        "\nVoltage " + getVoltage() +
                        "\nPrice of Electronics" + getPrice());

    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }

    @Override

    public void printOutTotalPrice() {
        System.out.println("Total price of computer" + getPrice());
    }

    @Override
    public void setDiscountedPrice() {

    }
}