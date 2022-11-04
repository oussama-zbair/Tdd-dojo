package com.nespresso.exercises.train.oop;

public class Cargo extends Wagon {
    private static final String EMPTY = "|____|";
    private static final String FULL = "|^^^^|";

    private String cargo;

    public Cargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String print() {
        return cargo;
    }

    public static Cargo emptyCargo() {
        return new Cargo(EMPTY);
    }

    public boolean fill() {
        if (isEmpty()) {
            this.cargo = FULL;
            return true;
        }

        return false;

    }

    public boolean isEmpty() {
        return this.cargo == EMPTY;
    }

}
