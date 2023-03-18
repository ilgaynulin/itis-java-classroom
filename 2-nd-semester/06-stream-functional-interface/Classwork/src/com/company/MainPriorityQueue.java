package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainPriorityQueue {
    public static void main(String[] args) {
        Human h1 = new Human("Ильяс");
        Human vet1 = new Human("Рэмбо", Category.VETERAN);
        Human h2 = new Human("Даша");
        Human vet2 = new Human("Билл", Category.VETERAN);

        try {
            h1.callMeWithTry();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }

        Queue<Human> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(h1);
        priorityQueue.add(vet1);
        priorityQueue.add(vet2);


        System.out.println(priorityQueue.poll());
    }



}
