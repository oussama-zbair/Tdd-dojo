package com.tdd.training.restaurant;

import java.util.List;

public class Recipe {
    private final String name;
    private final String preparationTime;
    private final List<Ingredient> ingredients;

    public Recipe(String name, String preparationTime, List<Ingredient> ingredients) {
        this.name = name;
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
    }

    public Meal cook() {
        return new Meal(1,this.preparationTime);
    }

    public List<Ingredient> ingredients() {
        return ingredients;
    }
}
