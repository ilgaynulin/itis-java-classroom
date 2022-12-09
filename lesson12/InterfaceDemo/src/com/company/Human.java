package com.company;

public class Human implements Speakable, Attackable {
    @Override
    public void speak() {
        System.out.println("Опять работа?");
    }

    @Override
    public void attack() {
        System.out.println("Ну вот, меня убьют");
    }
}
