package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int numOfThreads = 5;
        Thread[] threads = new Thread[numOfThreads];
        for(int i = 0; i < numOfThreads; i++) {
            if(i == 3) {
                threads[i] = new HelloWorldThread(new Date(), true);
            } else {
                threads[i] = new HelloWorldThread(new Date(), false);
            }
        }
        System.out.println("Потоков готовых к запуску: " + numOfThreads);

        for(int i = 0; i < numOfThreads; i++) {
            threads[i].start();
        }
    }
}
