package com.company;

public class MainOneResurceManyThreads {
    public static void main(String[] args) {
        BonusCard bonusCard = new BonusCard();

        for(int i = 0; i < 100; i++) {
            Thread bonusCardIncrementer =
                    new BonusCardIncrementThread(bonusCard);
            bonusCardIncrementer.start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bonusCard.getBalance());
    }
}
