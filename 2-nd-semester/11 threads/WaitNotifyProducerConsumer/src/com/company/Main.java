package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Thread producer = new Producer(store);
        Thread consumer = new Consumer(store);
        consumer.start();
        producer.start();

    }
}
