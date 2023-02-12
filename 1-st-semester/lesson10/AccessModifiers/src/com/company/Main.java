package com.company;

import entity.Engineer;
import entity.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John", 21, 180, 70);
        person.sayHello();
        person.setName("Jenny");
        person.sayHello();

        // person.age = 5;

        if(person.isOverweight()) {
            System.out.println(person.getName() + " полный");
        } else {
            System.out.println(person.getName() + " в форме");
        }

        Engineer en = new Engineer("John", 21, 180, 70);
        en.sayHello();
    }
}
