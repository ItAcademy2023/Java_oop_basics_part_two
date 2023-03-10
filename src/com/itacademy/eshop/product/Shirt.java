package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.interfaces.Wearable;
import com.itacademy.eshop.product.types.Category;

public class Shirt extends Clothing implements Wearable {
    /*
     * Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
     */
    private String type;
    private String color;

    public Shirt(String name, double price, Category category, String voltage, String brand, String type, String color) {
        super(name, price, category, voltage, brand);//an object of a computer
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    /**
     * This annotation indicates that the getPrice() method is being overridden from the parent class.
     */

    @Override
    public double getPrice() {
        /**
         * getPrice is an example of polymorphism: it overrides the getPrice method defined in Product,
         * allowing for custom pricing for computers
         */
        return super.getPrice() * 1.2;// takes price from the parent which is Product
    }


    @Override
    public void displayProductInfo() {
/**  getCategoryElectronics();
 *   print all the fiellds
 * main abstract which is on the product class*/
        System.out.println(
                "Category" + getCategory() +
                        "Type" + getType() +
                        "Color" + getColor() + "Price" + getPrice());


        throw new UnsupportedOperationException("displayProductInfo() method is not implemented yet.");
    }


    @Override

    public void printOutTotalPrice() {
        System.out.println("Total price of computer" + getPrice());
    }

    @Override
    public void setDiscountedPrice() {
    }

    @Override
    public void setWearable() {

    }
}