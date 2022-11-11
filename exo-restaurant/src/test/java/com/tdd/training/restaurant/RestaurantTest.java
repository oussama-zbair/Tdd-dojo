package com.tdd.training.restaurant;

import org.junit.Test;



import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantTest {

    /**
     * recipe for a single dish of Tomato Mozzarella Salad is
     *
     445* 1 ball of Mozzarella
     * 2 tomatoes
     * some olive oil
     *
     * preparation time is 6 minutes
     *
     * regarding Restaurant stocks :
     *   if there is no quantity it means that the ingredient is in stock and unlimited. (here it concern olive oil and pepper)
     */
    @Test
    public void shouldServeTomatoMozzarellaSalad(){
        Restaurant restaurant = new Restaurant("6 balls Mozzarella", "20 tomatoes", "olive oil");
        Ticket ticket = restaurant.order("1 Tomato Mozzarella Salad");
        Meal meal = restaurant.retrieve(ticket);
        assertThat(meal.servedDishes()).isEqualTo(1);
        assertThat(meal.cookingDuration()).isEqualTo("6");
    }

    /**
     * write a test to ensure that when a recipe require out of stocks ingredients we receive an UnavailableDishException (unchecked)
     */
// Allowed modification zone stats here
    @Test(expected = UnavailableDishException.class)
    public void shouldFailWhenOutOfStock() {
        Restaurant restaurant = new Restaurant("2 balls Mozzarella", "1 tomatoes", "olive oil", "sea salt");
        restaurant.order("1 Tomato Mozzarella Salad");
    }
// Allowed modification zone ends here



    /**
     * when cooking more than one dish of the same type :
     * first dish takes standard time, subsequents dish have their cooking time halved
     *
     * here : first = 6 ; 2nd = 3 ; 3rd = 3 ; 4th = 3 => 15 minutes
     */
    @Test
    public void shouldCookFasterWhenDoingMultipleInstanceOfTheSameDish(){
        Restaurant restaurant = new Restaurant("6 balls Mozzarella", "20 tomatoes", "olive oil", "sea salt");
        Ticket ticket = restaurant.order("4 Tomato Mozzarella Salad");
        Meal meal = restaurant.retrieve(ticket);
        assertThat(meal.servedDishes()).isEqualTo(4);
        assertThat(meal.cookingDuration()).isEqualTo("15");
    }



}
