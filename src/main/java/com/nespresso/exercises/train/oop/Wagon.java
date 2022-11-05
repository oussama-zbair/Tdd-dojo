package com.nespresso.exercises.train.oop;

public abstract class Wagon {

    public abstract String print();


    static class Formats {
        static final String HEAD = "<HHHH";
        static final String Passenger = "|OOOO|";
        static final String Restaurant = "|hThT|";
        static final String Tail = "HHHH>";
    }
}
