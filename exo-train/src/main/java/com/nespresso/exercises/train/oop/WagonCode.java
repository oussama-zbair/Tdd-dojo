package com.nespresso.exercises.train.oop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum WagonCode {
    H, P, R, C, T;


    public static List<WagonCode> from(String structure) {
        String[] values = reformatIfNeeded(structure);
        return Arrays.stream(values).map(WagonCode::valueOf).collect(Collectors.toList());
    }

    private static String[] reformatIfNeeded(String structure) {
        String[] values = structure.split("");
        if (values[values.length - 1].equals(WagonCode.H.name())) {
            values[values.length - 1] = WagonCode.T.name();
        }
        return values;
    }
}
