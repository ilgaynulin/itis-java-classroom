package com.company;

public class Main {

    public static void main(String[] args) {
	    int a1 = 2;
        int a2 = 4;
        System.out.println(Calculator.sum(a1, a2)); // метод sum ожидает объекты класса Integer, но передав примитив int, JRE неявно упаковывает int в Integer

        Integer i = 5; // автоупаковка
        Double d = 1.0;
        Short s = 1;
        Boolean b = true;


        Integer[] integers = new Integer[10];

        int counter = 0;
        for(Integer num : integers) {
            integers[counter] = counter++; //
        }

        int sum = 0;
        int negativesSum = 0;
        for(Integer num : integers) {
            sum += num;
            if(num < 0) {
                negativesSum += num;
            }
        }

        Integer i1 = 2;
        Double d1 = 2.0;

        Calculator.sum(i1, d1);

    }
}
