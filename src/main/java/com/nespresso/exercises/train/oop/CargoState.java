package com.nespresso.exercises.train.oop;

public enum CargoState {
    EMPTY("|____|"), FULL("|^^^^|");

    private String content;

    CargoState(String scontent) {
        this.content = scontent;
    }

    public String print() {
        return this.content;
    }
}
