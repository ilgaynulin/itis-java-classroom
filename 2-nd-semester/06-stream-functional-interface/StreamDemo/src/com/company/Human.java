package com.company;

// Создание конструктора Alt + Insert в IDEA
public class Human {
    private String name;
    private int age;



    private String country;


    public Human(String name, int age, String country) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        if(age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        } else {
            this.age = age;
        }
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + country;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
