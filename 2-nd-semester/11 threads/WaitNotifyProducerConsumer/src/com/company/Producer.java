package com.company;

public class Producer extends Thread {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.fill();
        }
    }
}
