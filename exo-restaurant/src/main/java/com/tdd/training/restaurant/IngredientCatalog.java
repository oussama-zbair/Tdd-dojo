package com.tdd.training.restaurant;

import java.util.Arrays;

public enum IngredientCatalog {
    BALLS_MOZZARELLA("balls Mozzarella", true),
    TOMATOES("tomatoes", true),
    OLIVE_OIL("olive oil", false),
    UNKNOWN("unknown", false);

    private final String label;
    private final boolean countable;

    IngredientCatalog(String label, boolean countable) {
        this.label = label;
        this.countable = countable;
    }

    public static boolean countable(String ingredient) {
        return IngredientCatalog.from(ingredient).countable;
    }

    public static IngredientCatalog from(String ingredient) {
        final IngredientCatalog[] values = IngredientCatalog.values();
        for (int i = 0; i < values.length; i++) {
            if (ingredient.contains(values[i].label)) {
                return values[i];
            }
        }
        return UNKNOWN;
    }
}
