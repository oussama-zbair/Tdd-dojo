package com.nespresso.exercises.train.oop;

public class WagonFactory {


    public static Wagon create(WagonCode wagonCode) {
        if (wagonCode == WagonCode.H) {
            return new Head();
        } else if (wagonCode == WagonCode.P) {
            return new Passenger();

        } else if (wagonCode == WagonCode.R) {
            return new Restaurant();

        } else if (wagonCode == WagonCode.T) {
            return new Tail();

        } else if (wagonCode == WagonCode.C) {
            return Cargo.emptyCargo();
        }

        throw new IllegalArgumentException("Invalid wagonCode: " + wagonCode);
    }
}
