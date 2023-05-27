package com.company;

public class Store {
    private int numberOfGoods;
    private final int LIMIT = 5;

    public Store() {
        this.numberOfGoods = 0;
    }

    public boolean canAcceptGood() {
        return numberOfGoods < LIMIT;
    }

    public boolean isStoreFull() {
        return numberOfGoods == LIMIT;
    }

    public boolean canSellGood() {
        return numberOfGoods > 0;
    }

    public synchronized void fill() {
        if(isStoreFull()) {
            System.out.println("Магазин переполнен");
            try {
                notify();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Магазин пополнился товаром");
            numberOfGoods++;
        }
    }

    public synchronized void sell() {
        try {
            if(!canSellGood()) {
                System.out.println("Магазин пустой");
                notify();
                wait();
            } else {
                Thread.sleep(1000);
                numberOfGoods--;
                System.out.println("Покупатель купил товар");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
