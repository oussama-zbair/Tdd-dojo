package com.tdd.training.restaurant;

public class UnavailableDishException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ingredient is out of our stock";
    }
}
