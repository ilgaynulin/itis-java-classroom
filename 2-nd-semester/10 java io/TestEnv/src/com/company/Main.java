package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        FileManager fileManager = new FileManager(System.getProperty("user.dir"));
        System.out.print(fileManager.getCurrentFolder() + ": ");
        String input = in.nextLine();

        while (!input.equals("exit")) {
            String tokens[] = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "ls":
                    if (tokens.length == 2 && tokens[1].equals("-l")) {
                        fileManager.listOfFiles(true);
                        break;
                    } else {
                        fileManager.listOfFiles(false);
                        break;
                    }
                case "cd":
                    String folderName = tokens[1];
                    fileManager.changeDirectory(folderName);
                    break;
                default:
                    System.out.println("Ввели неверную команду! Введите новую команду: ");
            }
            System.out.print(fileManager.getCurrentFolder() + ": ");
            input = in.nextLine();
        }
    }
}
