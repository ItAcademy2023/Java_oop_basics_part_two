package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

public class Book extends Books{
    private String bookCover;
    private String bookAuthor;
    public Book(String name, double price, Category category, String genre, int pageCount, String bookCover, String bookAuthor) {
        super(name, price, category, genre, pageCount);
        this.bookCover = bookCover;
        this.bookAuthor = bookAuthor;
    }
    @Override
    public void displayProductInfo() {
        System.out.printf("Book name: %s\n" +
                "Book genre: %s\n" +
                "Book page count: %d\n", getName(), getGenre(), getPageCount());
    }
    @Override
    public void abstractOverridenMethod() {
        throw new UnsupportedOperationException("abstractOverriddenMethod() method is not implemented yet.");
    }
}
