package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();

        strings.add("Hi");
        strings.add("Привет");
        strings.add("2");

        System.out.println("Получаем итератор");
        Iterator<String> it = strings.iterator();

        System.out.println("Пробегаемся по нему:");
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        System.out.println("Получение элемента по индексу");
        System.out.println(strings.get(2));

        System.out.println("Поиск элемента в списке");
        System.out.println(strings.indexOf("Привет"));

        System.out.println("Доступны методы интерфейса Collection, например size():");
        System.out.println(strings.size());

        System.out.println("Также метод clear:");
        strings.clear();
        System.out.println("Теперь размер нашего списка равен:");
        System.out.println(strings.size());


    }
}
