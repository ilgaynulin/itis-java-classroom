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
        System.out.println("Магазин пополнился товаром");
        numberOfGoods++;
        if(isStoreFull()) {
            System.out.println("Магазин заполнился товаром");
            try {
                notify();
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void sell() {
        try {
            Thread.sleep(2000);
            numberOfGoods--;
            if(!canSellGood()) {
                System.out.println("Магазин пустой");
                wait();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}
