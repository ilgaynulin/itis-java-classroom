package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = { -1 , 9, 0 , 2, 1 };

        Sortable sortable = new MyArray();
        sortable.setArray(array);
        System.out.println(Arrays.toString(sortable.getArray()));
        sortable.sort();
        System.out.println(Arrays.toString(sortable.getArray()));
    }
}
