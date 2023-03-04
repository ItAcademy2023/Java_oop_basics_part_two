package com.itacademy.eshop.simulations;

import com.itacademy.eshop.exceptions.ProductNotFoundException;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

/**
 * This class represents a simulation of a customer shopping on an Eshop.
 * The customer can add and remove products from their shopping cart,
 * as well as leave reviews and ratings for the products.
 */
public class CustomerSimulation {
    private Eshop shop;
    private ShoppingCart shoppingCart;

    public CustomerSimulation(Eshop shop) {
        this.shop = shop;
        shoppingCart = new ShoppingCart();
    }

    public ShoppingCart simulateCustomerShopping() throws ProductNotFoundException {
        addProductsToShoppingCart();
        removeProductsFromShoppingCart();
        leaveReviewsAndRatingsForProducts();
        return shoppingCart;
    }

    private void addProductsToShoppingCart() throws ProductNotFoundException {
        /**
         * User browses the shop and adds 4 products to the shopping cart.
         * One of them should be a book and other should be a shirt.
         */

        shoppingCart.addProduct(shop.findProductByName("Shirt"));
        shoppingCart.addProduct(shop.findProductByName("Book"));
        shoppingCart.addProduct(shop.findProductByName("product one"));
        shoppingCart.addProduct(shop.findProductByName("product two"));
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeProductByName("Shirt");
    }

    private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves review for each product in the shopping cart.
         */
        Review review = new Review("John Doe", 5, "This is a review for the shirt");

        try {
            shoppingCart.getProductByName("Book").addReview(review);
        } catch (ProductNotFoundException e) {
            System.out.println("Review was not left, " + e.getMessage());
        }

    }


}
