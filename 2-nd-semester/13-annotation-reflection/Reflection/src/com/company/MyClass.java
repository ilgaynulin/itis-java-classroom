package com.company;

public class MyClass {
    private int i;
    public double d;

    public MyClass() {
    }

    MyClass(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public void openMethod() {
        System.out.println("I am public method");
    }

    @MyAnnotation
    private void closedMethod() {
        System.out.println("I am private method");
    }
}
