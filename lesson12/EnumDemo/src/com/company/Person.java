package com.company;

import com.company.enums.Gender;

public class Person {
    private String name;
    private int age;
    private Gender gender;


    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNDEFINED;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
