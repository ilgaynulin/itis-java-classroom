package com.company;

public class BonusCardIncrementThread extends Thread {
    private BonusCard bonusCard;

    public BonusCardIncrementThread(BonusCard bonusCard) {
        this.bonusCard = bonusCard;
    }

    @Override
    public void run() {
        // Инициализация, вычисления сколько именно добавить бонусов
        synchronized (bonusCard) {
            // Держите в syncronized только тот код, который относиться к общему ресурсу (bonuscard)
            // Избегайте длительных операций
            Integer balance = bonusCard.getBalance();
            try {
                Thread.sleep(10); // Для воспроизведения ошибки одновременного обращения к ресурсу
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bonusCard.setBalance(balance + 1);
        }


    }
}
