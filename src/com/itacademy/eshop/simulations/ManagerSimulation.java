package com.itacademy.eshop.simulations;

import com.itacademy.eshop.exceptions.DuplicateProductException;
import com.itacademy.eshop.product.*;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.ClothingSize;
import com.itacademy.eshop.shop.Eshop;

/**
 * This class simulates the activity of a manager in the e-shop. The manager will create new products and add them to the shop,
 * remove one product from the shop, change the price for a product, and remove all products with the category FOOD.
 */
public class ManagerSimulation {

    private final Eshop shop;

    public ManagerSimulation(Eshop shop) {
        this.shop = shop;
    }

    public void simulate() throws DuplicateProductException {
        addThreeNewProducts();
        findAndRemoveOneProduct();
        changePriceForOneProduct();
        removeAllProductsWithCategory(Category.FOOD);
    }

    private void addThreeNewProducts() throws DuplicateProductException {
        /**
         * adds three new products to the shop. One of them should be a book, one should be a Laptop, and one should be a shirt.
         * All must be different types of products.
         */
        Product computer = new Computer("Laptop", 1000, Category.ELECTRONICS, "12", "apple", "intel", 16);
        Product book = new Book("Amazing Maurice", 10, Category.BOOKS, "T. Pratchett");
        Product shirt = new Clothing("Shirt", 8, Category.CLOTHING, "Pink", "shirt", ClothingSize.S);
        shop.addProduct(computer);
        shop.addProduct(book);
        //shop.addProduct(computer);
        shop.addProduct(shirt);
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