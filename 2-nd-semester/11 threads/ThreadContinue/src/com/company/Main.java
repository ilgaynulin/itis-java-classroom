package com.company;

import java.util.concurrent.TransferQueue;

public class Main {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };

        Thread thread1 = new Thread(task);
        thread1.start();

        Integer sum = 12;
        Thread thread2 = new Thread(() -> System.out.println("Hello lambda!" + sum));
        Thread thread3 = new Thread(() -> System.out.println(sum));
        thread2.start();
        thread3.start();
    }
}
