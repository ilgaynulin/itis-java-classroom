package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, -1, 6, 0, 5};
        MyArray ma = new MyArray(array);
        System.out.println(ma);
        ma.insertionSort();
        System.out.println(ma);
    }
}
