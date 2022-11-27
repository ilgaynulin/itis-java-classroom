package com.company;

public class Main {

    public static void main(String[] args) {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex c3 = new Complex(1.0, 2.0);

//        Complex sum = c1.sum(c2);
//        System.out.println(sum);
        System.out.println("c1 equals c2 " + c1.equals(c2));
        System.out.println("c1 equals c3 " + c1.equals(c3));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.multiply(c2));
    }
}
