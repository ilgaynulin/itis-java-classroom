package com.company;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Меня зовут " + name);
    }

    public String getName() {
        return name;
    }
}
