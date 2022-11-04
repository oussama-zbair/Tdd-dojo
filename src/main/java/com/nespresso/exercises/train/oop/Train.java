package com.nespresso.exercises.train.oop;

import java.util.ArrayList;
import java.util.List;

public class Train {
    List<Wagon> wagons = new ArrayList<>();


    public Train(String structure) {
        char[] chars = parse(structure);
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'H') {
                wagons.add(new Head());
            } else if (chars[i] == 'P') {
                wagons.add(new Passenger());

            } else if (chars[i] == 'R') {
                wagons.add(new Restaurant());

            } else if (chars[i] == 'T') {
                wagons.add(new Tail());

            } else if (chars[i] == 'F') {
                wagons.add(new CargoFill());

            } else if (chars[i] == 'C') {
                wagons.add(new CargoEmpty());

            }

        }

    }

    private char[] parse(String structure) {
        char[] chars = structure.toCharArray();
        if (chars[chars.length - 1] == 'H') {
            chars[chars.length - 1] = 'T';
        }
        return chars;


    }

    public String print() {
        StringBuilder train = new StringBuilder();

        for (Wagon w : wagons) {
            train.append(w.print());
            train.append("::");
        }
        train.delete(train.length() - 2, train.length());
        return train.toString();
    }

    public void detachEnd() {
        wagons = wagons.subList(0, wagons.size() - 1);

    }

    public void detachHead() {
        wagons = wagons.subList(1, wagons.size());

    }


    public boolean fill() {
        for (int i = 0; i < wagons.size(); i++) {
            Wagon w = wagons.get(i);
            if (w instanceof CargoEmpty) {
                wagons.set(i, new CargoFill());
                return true;
            }
        }


        return false;
    }
}
