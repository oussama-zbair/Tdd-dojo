package com.tdd.training.restaurant;

import java.util.Objects;
import java.util.Optional;

public class Ingredient{
    private final String name;
    private final int quantity;

    public Ingredient(int quantity, String name) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean lessQuantity(Ingredient ingredient) {
        return this.quantity <  ingredient.quantity;
    }
}
