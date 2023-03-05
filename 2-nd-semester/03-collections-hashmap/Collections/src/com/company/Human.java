package com.company;

import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private String surname;

    public Human(String name,String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    /*
    Повторный вызов hashCode для одного и того же объекта должен возвращать одинаковые хеш-значения, если поля объекта, участвующие в вычислении значения, не менялись.
    Если equals() для двух объектов возвращает true, hashCode() также должен возвращать для них одно и то же число.
    При этом неравные между собой объекты могут иметь одинаковый hashCode.

     */
    @Override
    public int hashCode() {
        int result = 1;
        result += 31 * name.hashCode();
        result += 31 * age;
        result += 31 * surname.hashCode();

        return result;
    }

    /*
    Рефлексивность — x.equals(x) возвращает true.
    Симметричность — x.equals(y) <=> y.equals(x).
    Транзитивность — x.equals(y) <=> y.equals(z) <=> x.equals(z).
    Согласованность — повторный вызов x.equals(y) должен возвращать значение предыдущего вызова, если сравниваемые поля не изменялись.
    Сравнение null — x.equals(null) возвращает false.

     */
//    @Override
//    public boolean equals(Object o) {
//        if(o == null) {
//            return false;
//        }
//
//        if(this == o) {
//            return true;
//        }
//
//        if(this.age == ((Human)o).age && ((Human)o).name.equals(this.name)) {
//            return true;
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }
}
