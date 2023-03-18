package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class DequeMain {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println("Добавили в начало addFirst 3 элемента");
        deque.addFirst("Первый");
        deque.addFirst("Второй");
        deque.addFirst("Третий");

        System.out.println("Вывод на экран очереди с помощью for-each");
        for(String s : deque) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Смотрим элемент с конца");
        System.out.println(deque.getLast());

        System.out.println("Забираем элемент с конца");
        System.out.println(deque.pollLast());
        System.out.println("Снова забираем элемент с конца");
        System.out.println(deque.pollLast());

        Map<String, String> map = new HashMap<>();

    }
}
