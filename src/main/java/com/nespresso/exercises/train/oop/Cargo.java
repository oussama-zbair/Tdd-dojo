package com.nespresso.exercises.train.oop;

public class Cargo extends Wagon {


    private final CargoState state;

    public Cargo() {
        this(CargoState.EMPTY);
    }

    public Cargo(CargoState state) {
        this.state = state;
    }

    @Override
    public String print() {
        return this.state.print();
    }

    public Cargo fill() {
        return new Cargo(CargoState.FULL);
    }

    public boolean empty() {
        return this.state == CargoState.EMPTY;
    }
}
