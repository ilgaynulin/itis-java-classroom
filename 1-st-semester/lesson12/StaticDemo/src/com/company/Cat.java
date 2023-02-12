package com.company;

public class Cat {
    private static int catCreated;   // Сколько котов было создано в программе
    private static final int numberLegs = 4;

    static {
        catCreated = 0;
    }

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        catCreated++;
    }

    public static int getCatCreated() {
        return catCreated;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
