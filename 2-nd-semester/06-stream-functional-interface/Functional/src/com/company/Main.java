package com.company;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = number -> number != null && number.doubleValue() > 0;

        // Возможные источники stream
        Stream.of(Integer.valueOf(1), Integer.valueOf(10), Integer.valueOf(-1), Integer.valueOf(-15), Integer.valueOf(23))
                .filter(isPositive)
                .forEach(integer -> System.out.println(integer + ", "));

        Function<Integer, String> convertNum = number -> number + " шт.";

        Function<Integer, String> convertNumAnonymClass = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + " шт.";
            }
        };

        Stream.of(Integer.valueOf(1), Integer.valueOf(10), Integer.valueOf(-1), Integer.valueOf(-15), Integer.valueOf(23))
                .filter(isPositive)
                .map(convertNum)
                .forEach(str -> System.out.println(str + ", "));
    }
}
