package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        System.out.println("Добавляем элементы");
        strings.add("Оливер");
        strings.add("Лейсан");

        System.out.println("Выводим всё множество на экран");
        for(String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("Снова пытаемся добавить Оливер");
        strings.add("Оливер");

        System.out.println("Выводим всё множество на экран");
        for(String str : strings) {
            System.out.print(str + ", ");
        }

        Human h1 = new Human("Салават", "Алюков", 17);
        Human h2 = new Human("Ильяс", "Гайнулин", 26);
        Human h3 = new Human("Руслан", "Алтынбаев", 20);
        Human h4 = new Human("Ильяс", "Гайнулин", 26);

        System.out.println("Теперь поработаем с множеством классов Human");
        Set<Human> humanSet = new LinkedHashSet<>();

        System.out.println("Добавляем элементы в множество:");
        humanSet.add(h1);
        humanSet.add(h2);
        humanSet.add(h3);
        humanSet.add(h4);

        System.out.println("h2 equals h4:");
        System.out.println(h2.equals(h4));

        System.out.println("Выводим на экран людей из множества:");
        for(Human h: humanSet) {
            System.out.println(h);
        }
    }
}
