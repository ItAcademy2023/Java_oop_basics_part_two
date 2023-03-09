package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

public class Smartphone extends Electronics implements Discountable {
    /**
     * Computer inherits from Electronics, which in turn inherits from Product, providing all of those properties
     */
    private String processor;
    private String screen;

    public Smartphone(String name, double price, Category category, String voltage, String brand, String processor, String screen) {
        super(name, price, category, voltage, brand);//an object of a computer
        this.processor = processor;
        this.screen = screen;
    }

    public String getProcessor() {
        return processor;
    }

    public String getScreen() {
        return screen;
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
                        "Voltage" + getVoltage() +
                        "Price" + getPrice());

        throw new UnsupportedOperationException("displayProductInfo() method is not implemented yet.");
    }

    @Override
    public double calculateDiscountedPrice() {
        //some implementation
        return getPrice() * 0.9;
    }
    @Override

    public void printOutTotalPrice() {
        System.out.println("Total price of smarphone" + getPrice());
    }
}