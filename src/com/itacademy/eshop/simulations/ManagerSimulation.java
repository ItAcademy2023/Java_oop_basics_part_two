package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

/**
 * This class simulates the activity of a manager in the e-shop. The manager will create new products and add them to the shop,
 * remove one product from the shop, change the price for a product, and remove all products with the category FOOD.
 */
public class ManagerSimulation {

    private Eshop shop;

    public ManagerSimulation(Eshop shop) {
        this.shop = shop;
    }

    public void simulate() {
        addThreeNewProducts();
        findAndRemoveOneProduct();
        changePriceForOneProduct();
//        removeAllProductsWithCategory(Category.FOOD);
    }

    private void addThreeNewProducts() {


        /**
         * adds three new products to the shop. One of them should be a book, one should be a Laptop, and one should be a shirt.
         * All must be different types of products.
         */
        Computer computer = new Computer("Laptop", 1000, Category.ELECTRONICS, "12", "apple", "intel", 16);
        shop.addProduct(computer);
        Novel oliverTwist = new Novel("Book", 15, Category.BOOKS, "Charles Dickens", "Serial novel", "Oliver Twist" );
        shop.addProduct(oliverTwist);
        Chips chips = new Chips("Chips", 1.99, Category.FOOD, "Lay's", "onion");
        shop.addProduct(chips);
        Shirt summerShirt = new Shirt("Shirt", 35, Category.CLOTHING, "green");
        shop.addProduct(summerShirt);
        ToyCar toyCar =  new ToyCar("ToyCar", 25.99, Category.TOYS, "blue", true);
        shop.addProduct(toyCar);
    }

    private void findAndRemoveOneProduct() {
        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
        shop.removeProduct("Laptop");
    }

    private void changePriceForOneProduct() {
        /**
         * manager searches for a product with the name "Shirt" (the one added a moment before) and changes its price to 20
         */
        shop.changePriceForProduct("Shirt", 20);

    }

    private void removeAllProductsWithCategory(Category category) {
        /**
         * manager removes all products with the category FOOD
         */
        shop.removeProduct(category);
    }


}