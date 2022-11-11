package com.tdd.training.restaurant;

public class Meal {
    private final int servedDishes;
    private final String cookingDuration;

    public Meal(int servedDishes, String cookingDuration) {
        this.servedDishes = servedDishes;
        this.cookingDuration = cookingDuration;
    }


    public int servedDishes() {
        return this.servedDishes;

    }

    public String cookingDuration() {
        return this.cookingDuration;
    }
}