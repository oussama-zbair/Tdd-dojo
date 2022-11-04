package com.nespresso.exercises.train.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Train {
    private final List<Wagon> wagons = new ArrayList<>();


    public Train(String structure) {
        for (WagonCode code : WagonCode.from(structure)) {
            wagons.add(WagonFactory.create(code));
        }
    }


    public String print() {
        return wagons.stream().
                map(Wagon::print).
                collect(Collectors.joining("::"));
    }

    public void detachEnd() {
        wagons.remove(wagons.size() - 1);

    }

    public void detachHead() {
        wagons.remove(0);

    }


    public boolean fill() {
        Optional<Cargo> cargo = wagons.stream()
                .filter(w -> w instanceof Cargo)
                .map(w -> ((Cargo) w))
                .filter(Cargo::isEmpty)
                .findFirst();

        return cargo.isPresent() ? cargo.get().fill() : false;
    }
}
