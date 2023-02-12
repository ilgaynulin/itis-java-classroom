package com.company;

public class Matrix {
    private double array[][];
    private int sizeX;
    private int sizeY;

    public Matrix(double[][] array) {
        this.array = array;
        sizeX = array.length;
        sizeY = array[0].length;
    }

    public Matrix sum(Matrix other) {
        if(this.sizeX != other.sizeX || this.sizeY != other.sizeY) {
            return null;
        }

        double res[][] = new double[sizeX][sizeY];

        for(int i = 0; i < sizeX; i++) {
            for(int j = 0; j < sizeY; j++) {
                res[i][j] = this.array[i][j] + other.array[i][j];
            }
        }

        return new Matrix(res);
    }
}
