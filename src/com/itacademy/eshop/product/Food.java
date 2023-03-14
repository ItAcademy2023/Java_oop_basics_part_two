package com.itacademy.eshop.product;

import com.itacademy.eshop.interfaces.Discountable;
import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;
public abstract class Food extends Product implements Discountable {
    private ArrayList<String> ingredients;
    private int calories;
    private boolean isOutOfDate;


    public Food (int calories, ArrayList<String> ingredients, boolean isOutOfDate, String name, double price, Category category) {
        super(name, price, category);

        this.calories = calories;
        this.isOutOfDate = isOutOfDate;
        this.ingredients = ingredients;
    }

    public int getCalories(){
        return calories;
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }
    public boolean getIsOutOfDate(){
        return isOutOfDate;
    }
    public void setCalories(int newCalories){
        calories = newCalories;
    }
    public void setIngredient(String ingredient){
        ingredients.add(ingredient);
    }
    public void setIsOutOfDate(boolean newIsOutOfDate){
        isOutOfDate = newIsOutOfDate;
    }
    @Override
    public double calculateDiscountedPrice(){
        if(isOutOfDate){
            return super.getPrice() * .8;
        }
        return getPrice();
    }
    @Override
    public void displayProductInfo() {
        System.out.println(
                "Name: " + getName()
                        + ", Price: " + getPrice()
                        + ", Category: " + getCategory()
                        + ", Calories: " + getCalories()
                        + ", Is Product Out Of Date: " + getIsOutOfDate()
                        + ", Ingredients" + getIngredients()
        );
    }
}
