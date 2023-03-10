package com.itacademy.eshop;

import com.itacademy.eshop.exceptions.DuplicateProductException;
import com.itacademy.eshop.exceptions.ProductNotFoundException;

public class Main {
    public static void main(String[] args) throws ProductNotFoundException, DuplicateProductException {
        Runner runner = new Runner();
        runner.run();
    }
}