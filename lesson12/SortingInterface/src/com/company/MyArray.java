package com.company;

public class MyArray implements Sortable {
    int[] array;

    @Override
    public void sort() {
        int temp;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int[] getArray() {
        return array;
    }

    @Override
    public void setArray(int[] array) {
        this.array = array;
    }
}
