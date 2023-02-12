package com.company;

// В idea Alt + Insert -> Constructor для создания конструктора, либо можно вручную
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        // this это ссылка на текущий объект
        if(object.getClass() != this.getClass()) {
            return false;
        }
        if(this.age == ((Person)object).age && this.name == ((Person)object).name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
