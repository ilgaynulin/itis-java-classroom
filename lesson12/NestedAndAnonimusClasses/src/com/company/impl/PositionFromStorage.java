package com.company.impl;

import com.company.interfaces.Position;

import java.util.Random;

public class PositionFromStorage implements Position {
    private static String position[] = { "Системный администратор", "Программист", "Тестировщик" };


    @Override
    public String givePosition() {
        Random random = new Random();
        return position[random.nextInt(2)];
    }
}
