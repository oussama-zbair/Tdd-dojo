package com.nespresso.exercises.train.oop;

import java.util.ArrayList;
import java.util.List;
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
        for (int i = 0; i < wagons.size(); i++) {
            Wagon w = wagons.get(i);
            if (empty(w)) {
                wagons.set(i, ((Cargo) w).fill());
                return true;
            }
        }
        return false;
    }

    private static boolean empty(Wagon wagon) {
        return wagon instanceof Cargo && ((Cargo) wagon).empty();
    }
}
