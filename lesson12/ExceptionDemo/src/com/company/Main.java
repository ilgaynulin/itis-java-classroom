package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Введите k: ");
            try {
                int k = in.nextInt();
                if(k < 0) {
                    System.out.println("Введите положительный k!");
                    continue;
                }
                System.out.println(fib(k));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число без точек и запятых");
                in.nextLine();
            }
        }

        System.out.println("Программа завершилась");
    }


    static int fib(int k) throws IllegalArgumentException {
        if(k == 0) {
            return 0;
        }

        if(k == 1 || k == 2) {
            return 1;
        }

        return fib(k - 2) + fib(k - 1);
    }
}
