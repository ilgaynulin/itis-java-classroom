package com.company.util;

import java.util.Arrays;

/**
 * Класс содержит полезные методы для массива
 */
public class ArrayUtils {
    public static int sum(int[] array) {
        int sum = 0;
        for(int el : array) {
            sum += el;
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for(double el : array) {
            sum += el;
        }
        return sum;
    }

    public static String print(int[] array) {
        String str = "";
        for(int el : array) {
            str += el + " ";
        }
        return str;
    }

    public static String print(double[] array) {
        String str = "";
        for(double el : array) {
            str += el + " ";
        }
        return str;
    }

    // Реализовать avg для int[] double[]

    public static double avg(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static double avg(double[] array) {
        return sum(array) / array.length;
    }
}
