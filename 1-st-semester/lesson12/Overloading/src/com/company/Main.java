package com.company;

import com.company.entity.Complex;
import com.company.util.ArrayUtils;
import com.company.util.IntegerUtils;

public class Main {

    public static void main(String[] args) {
//        int[] array = { 2, 4, -1, 2};
//        System.out.println("Целочисленный массив: " + ArrayUtils.print(array));
//        System.out.println("Сумма массива: " + ArrayUtils.sum(array));
//      System.out.println("Среднее для целочисленного: " + ArrayUtils.avg(array));
//        double[] dArray = {1.0, 2.0, 0};
//        System.out.println("Массив с вещественными числами: " + ArrayUtils.print(dArray));
//        System.out.println("Сумма массива: " + ArrayUtils.sum(dArray));
//        System.out.println("Сруднее для вещественного: " + ArrayUtils.avg(dArray));
////        System.out.println(IntegerUtils.max(2, 1));
////        System.out.println(IntegerUtils.max(1, 4, 3, 5, 7, 8));

        Complex c1 = new Complex(1.0, 2.0);

        Complex c2 = new Complex(c1);

        if(c1 == c2) {
            System.out.println("Объекты с одинаковой ссылкой");
        } else {
            System.out.println("Объекты разные");
        }
    }
}
