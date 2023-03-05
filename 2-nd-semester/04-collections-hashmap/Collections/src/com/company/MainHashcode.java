package com.company;

import java.util.Scanner;

public class MainHashcode {
    public static void main(String[] args) {
        int MAX_SIZE = 8;
        String[] passwords = new String[MAX_SIZE];
        Scanner in = new Scanner(System.in);

        passwords["kent".hashCode() & (MAX_SIZE - 1)] = "qwerty";
        passwords["oleg".hashCode() & (MAX_SIZE - 1)] = "asdf";
        passwords["ruslan".hashCode() & (MAX_SIZE - 1)] = "password";

        System.out.println("Введите login:");
        String login = in.nextLine();
        System.out.println("Введите пароль:");
        String password = in.nextLine();

        if(password.equals(passwords[login.hashCode() & (MAX_SIZE - 1)])) {
            System.out.println("Вы вошли в систему");
        } else {
            System.out.println("Не вошли");
        }


    }
}
