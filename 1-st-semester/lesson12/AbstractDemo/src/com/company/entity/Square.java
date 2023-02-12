package com.company.entity;

public class Square extends ColorFigure {
    private double a; // сторона

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Квадрат стороной " +
                "a=" + a;
    }
}
