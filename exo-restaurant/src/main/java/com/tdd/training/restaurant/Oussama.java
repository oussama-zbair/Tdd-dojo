package com.tdd.training.restaurant;

public class Oussama {

    public static void main(String[] args) {
        final String[] ingredientParts = "20 tomatoes".split(" ", 2);

        int quantity = Integer.valueOf(ingredientParts[0]);
        String ingredientName = ingredientParts[1];

        System.out.println(quantity);
        System.out.println(ingredientName);

    }
}
