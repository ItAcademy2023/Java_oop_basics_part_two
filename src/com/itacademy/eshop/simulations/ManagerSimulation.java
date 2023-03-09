package com.itacademy.eshop.simulations;

import com.itacademy.eshop.exceptions.DuplicateProductException;
import com.itacademy.eshop.product.Computer;
import com.itacademy.eshop.product.Novel;
import com.itacademy.eshop.product.Shirt;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.NovelTypes;
import com.itacademy.eshop.product.types.Seasons;
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
        Computer computer = new Computer("Laptop", 1000, Category.ELECTRONICS, 110, "apple", "intel", 16);
        shop.addProduct(computer);
        shop.addProduct(new Shirt("Shirt", 20, Category.CLOTHING, "short sleeve", 18, Seasons.AUTUMN, 'S'));
        shop.addProduct(new Novel("Book", 40, Category.BOOKS, "Famous author", 2020, 900, NovelTypes.ROMANTIC));
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