package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
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
        removeAllProductsWithCategory(Category.FOOD);
    }

    private void addThreeNewProducts() {
        /**
         * adds three new products to the shop. One of them should be a book, one should be a Laptop, and one should be a shirt.
         */
        Product shirt = new Product("Shirt", 10, Category.CLOTHING);
        Product laptop = new Product("Laptop", 1000, Category.ELECTRONICS);
        Product book = new Product("Book", 20, Category.BOOKS);
        shop.addProduct(shirt);
        shop.addProduct(laptop);
        shop.addProduct(book);
    }

    private void findAndRemoveOneProduct() {
        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
        shop.removeProductByName("Laptop");
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
        shop.removeProductByCategory(category);
    }


}