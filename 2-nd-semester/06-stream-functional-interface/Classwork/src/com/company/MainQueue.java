package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Добавляем элементы в очередь
        System.out.println("Добавили первых трёх");
        queue.add("Первый");
        queue.add("Второй");
        queue.add("Третий");

        System.out.println("Позвали следующего");
        System.out.println(queue.poll());
        System.out.println("Добавили четвёртого");
        queue.add("Четвёртый");
        System.out.println("Позвали следующего");
        System.out.println(queue.poll());
    }
}
