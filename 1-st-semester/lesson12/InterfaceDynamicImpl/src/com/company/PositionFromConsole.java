package com.company;

import java.util.Scanner;

public class PositionFromConsole implements Position {

    @Override
    public String givePosition() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите должность работника: ");
        return in.nextLine();
    }
}
