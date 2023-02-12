package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Котов создано: " + Cat.getCatCreated());
        Cat cat1 = new Cat("Murzik", 1);
        System.out.println("Котов создано: " + Cat.getCatCreated());
        Cat cat2 = new Cat("Blanka", 2);
        System.out.println("Котов создано: " + Cat.getCatCreated());

        System.out.println("У котов " + Cat.getCatCreated() + " лап");

        final double PI = Math.PI;
        System.out.println(Calculator.sum(1, 3));
        Integer.parseInt("1");
        Math.sqrt(4);
    }
}
