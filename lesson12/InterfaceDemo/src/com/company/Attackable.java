package com.company;

public interface Attackable {
    default void attack() {
        System.out.println("Атакую!");
    }
}
