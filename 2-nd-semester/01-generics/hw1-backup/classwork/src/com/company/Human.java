package com.company;

// Создание конструктора Alt + Insert в IDEA
public class Human {
    private String name;
    private int age;


    public Human(String name, int age) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        if(age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + " и мне " + age;
    }

    public int getAge() {
        return age;
    }
}
