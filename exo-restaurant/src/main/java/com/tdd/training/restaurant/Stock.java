package com.tdd.training.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stock {
    List<Ingredient> ingredients = new ArrayList<>();


    public void add(int quantity, String ingredient) {
        this.ingredients.add(new Ingredient(quantity,IngredientCatalog.from(ingredient).name()));
    }

    public boolean check(Ticket ticket) {
        final Recipe recipe = Recipes.get(ticket);
        for(Ingredient ingredient : recipe.ingredients()){
            if(outOfStock(ingredient)){
                return false;
            }
        }
        return true;
    }

    private boolean outOfStock(Ingredient recipeIngredient) {
        final Optional<Ingredient> item = ingredients.stream().filter(recipeIngredient::equals).findFirst();
        return  item.get().lessQuantity(recipeIngredient);
    }
}