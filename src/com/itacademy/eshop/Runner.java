package com.itacademy.eshop;

import com.itacademy.eshop.exceptions.ProductNotFoundException;
import com.itacademy.eshop.services.ShopService;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;
import com.itacademy.eshop.simulations.CustomerSimulation;
import com.itacademy.eshop.simulations.ManagerSimulation;

public class Runner {

    public void run() throws ProductNotFoundException {
        ShopService shopService = new ShopService();
        Eshop shop = shopService.createShop();

        /**
         * Inheritance:
         *      1. Create at one or more class per each category that extends the Product class.
         *      2. Create a new subclass of Electronics, such as Smartphone or TV, that inherits from the Electronics class.
         * Polymorphism:
         *     1. Create a new method in the Product class that will be overridden in the subclasses.
         *     2. Create one more interface and implement it in at least one class.
         *     3. Implement displayProductInfo method in each Product class
         *     4. Create at least one more case of overloading
         *     5. Create an abstract class called payment with abstract method processPayment(). Add some fields and methods to it.
         *     6. Create two classes that extend the payment class.
         * Encapsulation:
         *    1. Write similar public method to getAverageRating that uses private fields and some logic to return desired output.
         *    2. Modify the Review class based on the encapsulation principles.
         * Exceptions:
         *      1. Modify the addProduct() method in the Eshop class to throw a DuplicateProductException if the product being added already exists in the product list.
         *      2. Catch that exception in the Runner class and print a message to the console.
         * */

        ManagerSimulation managerSimulation = new ManagerSimulation(shop);
        managerSimulation.simulate();
        /**
         * After the simulation, the shop should contain at least on product per category except FOOD.
         * Should contain products with the following names: "Shirt", "Book".
         * Should not contain products with the following names: "Laptop".
         *
         * Products in different categories should be displayed differently.
         * Prices of each category should be calculated differently.
         */
        shop.printProducts();

        CustomerSimulation customerSimulation = new CustomerSimulation(shop);
        ShoppingCart shoppingCart = customerSimulation.simulateCustomerShopping();
        /**
         * After the simulation, the shopping cart should contain 3 products. One of them should be a book.
         * Should have total price combined by all products in the cart
         */
        shoppingCart.printShoppingCart();
    }
}
