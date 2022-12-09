package com.company.entity;

public class Rectangle extends ColorFigure {
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
