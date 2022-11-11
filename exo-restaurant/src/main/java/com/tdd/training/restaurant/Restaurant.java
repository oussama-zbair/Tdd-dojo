package com.tdd.training.restaurant;


public class Restaurant {

    final private Stock stock = new Stock();


    public Restaurant(String... ingredients) {
        for (int i = 0; i < ingredients.length; i++) {
            if ( IngredientCatalog.countable(ingredients[i])) {
                final String[] ingredientParts = ingredients[i].split(" ", 2);

                int quantity = Integer.valueOf(ingredientParts[0]);
                String ingredientName = ingredientParts[1];
                stock.add(quantity, ingredientName);

            } else {
                stock.add(-1, ingredients[i]);
            }

        }


    }


    public Ticket order(String order) {
        final Ticket ticket = new Ticket(order);
        if(stock.check(ticket)){
            return ticket;
        }
        throw new UnavailableDishException();
    }


    public Meal retrieve(Ticket ticket) {
        Recipe recipe= Recipes.get(ticket);
        return recipe.cook();
    }


}
