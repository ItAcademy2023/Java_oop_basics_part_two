package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Computer extends Electronics implements Discountable {
    /** Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
    */
    private String processor;
    private int ram;

    public Computer(String name, double price, Category category, String voltage, String brand, String processor, int ram) {
        super(name, price, category, voltage, brand);
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    /** This annotation indicates that the getPrice() method is being overridden from the parent class.*/
    @Override
    public double getPrice() {
        /**
         * getPrice is an example of polymorphism: it overrides the getPrice method defined in Product,
         * allowing for custom pricing for computers
         */
        return super.getPrice() * 1.2;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Computer name: " + getName());
        System.out.println("Processor type: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
    }

    @Override
    public void deleteReviewByAuthor(String author) {
        if(this.getReviews().size()!=0){
            for (Review review: getReviews()){
                if(review.getAuthor().equals(author)){
                    getReviews().remove(review);
                    break;
                }
            }
        }else{
            System.out.println("No reviews found");
        }
    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }
}