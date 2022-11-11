package com.tdd.training.restaurant;


import java.util.List;

public class Recipes {
    private static final Recipe TomatoMozzarellaSalad = new Recipe(
            "Tomato Mozzarella Salad",
            "6",
            List.of(
                    new Ingredient(1, IngredientCatalog.BALLS_MOZZARELLA.name()),
                    new Ingredient(2,IngredientCatalog.TOMATOES.name()),
                    new Ingredient(-1,IngredientCatalog.OLIVE_OIL.name()))


            );


    public static Recipe get(Ticket ticket) {
        return TomatoMozzarellaSalad;
    }
}
