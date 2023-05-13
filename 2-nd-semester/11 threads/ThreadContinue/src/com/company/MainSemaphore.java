package com.company;

import java.util.concurrent.Semaphore;

public class MainSemaphore {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        Thread[] philosophers = new Thread[6];
        for(int i = 0; i < philosophers.length; i++) {
            philosophers[i] = new Philosopher(sem, Integer.toString(i));
        }
    }
}
