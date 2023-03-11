package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Ильяс", 26, "Россия"));
        humans.add(new Human("Роуз", 96, "Швейцария"));
        humans.add(new Human("Марк", 3, "Европа"));
        humans.add(new Human("Марк", 3, "Европа"));
        humans.add(new Human("Аня", 3, "Европа"));
        humans.add(new Human("Дора", 3, "Европа"));
        humans.add(new Human("Швондер", 3, "Европа"));

        for(Human h : humans) {
            System.out.println(h);
        }

        System.out.println("Фильтруем по возрасту");
        humans.stream()
                .filter(el -> el.getAge() > 10)
                .forEach(human -> System.out.println(human));

//        System.out.println("Фильтруем по возрасту");
        System.out.println("Выводим все имена");
        humans.stream()
                .map(human -> human.getName())
                .forEach(s -> System.out.println(s));

        System.out.println("Попробуем поменять внутренности элементов");
        List<Human> allHumansOneYear = humans.stream()
                .map(h -> new Human(h.getName(), 1, h.getCountry()))
                .collect(Collectors.toList());

        for(Human h : humans) {
            System.out.println(h);
        }

        for(Human h : allHumansOneYear) {
            System.out.println(h);
        }

        System.out.println("Сколько людей старше 20 лет?");
        long num = humans.stream()
                .filter(el -> el.getAge() > 10)
                .count();
        System.out.println(num);
    }
}
