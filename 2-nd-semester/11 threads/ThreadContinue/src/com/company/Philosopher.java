package com.company;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private Semaphore sem;
    private boolean full;
    private String name;

    public Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        if(!full) {
            try {
                sem.acquire();
                System.out.println("Философ " + name + " садится за стол");
                Thread.sleep(3000);
                full = true;
                System.out.println("Философ " + name + " освобождает стол")
                sem.release();
            } catch (InterruptedException e) {
                System.out.println("Что-то пошло не так");
            }
        }
    }
}
