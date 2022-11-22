package com.company;

public class Main {

    public static void main(String[] args) {
        double array[][] = {
                {1.0, 2.0},
                {2.0, 3.0}
        };

        double array2[][] = {
                {2.0, 3.0},
                {4.0, 5.0}
        };

        Matrix m1 = new Matrix(array);
        Matrix m2 = new Matrix(array2);

        Matrix sum = m1.sum(m2);
    }
}
