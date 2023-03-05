package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> orderMap = new HashMap<>();

        System.out.println("Положили данные");
        orderMap.put(10, "Ильяс");
        orderMap.put(30, "Агутин");

        System.out.println("Чтение по ключу 10:");
        System.out.println(orderMap.get(10));

        System.out.println("Добавляем по прежнему ключу новое значение");
        orderMap.put(10, "Агилера");

        Set<Integer> keys = orderMap.keySet();

        System.out.println("Выводим на экран все значения Мапы");
        for(Integer k : keys) {
            System.out.println(orderMap.get(k));
        }

        System.out.println("Удаление элемента по ключу 30");
        orderMap.remove(30);

        System.out.println("Выводим на экран все значения Мапы");
        for(Integer k : keys) {
            System.out.println(orderMap.get(k));
        }

    }
}
