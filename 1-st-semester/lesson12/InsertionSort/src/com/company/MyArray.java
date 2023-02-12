package com.company;

import java.util.Arrays;

public class MyArray {
    int[] array;


    public MyArray(int[] array) {
        this.array = array;
    }

    public void insertionSort() {
        int hold;
        for(int i = 1; i < array.length; i++) {
            hold = array[i];
            for(int j = i - 1; j >= 0; j--) {
                if(array[j] < hold) {
                    break;
                } else {
                    array[j + 1] = array[j];
                    array[j] = hold;

                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
