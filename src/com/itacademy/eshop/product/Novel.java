package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.NovelTypes;

public class Novel extends Books {
    NovelTypes novelType;

    public Novel(String name, double price, Category category, String author, int releaseYear, int pageCount, NovelTypes novelType) {
        super(name, price, category, author, releaseYear, pageCount);
        this.novelType = novelType;
    }

    public NovelTypes getNovelType() {
        return novelType;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName() +
                        "Price: " + getPrice() +
                        "Page Count: " + getPageCount()
        );
    }

    @Override
    public void showOnlyImportant() {

    }


}