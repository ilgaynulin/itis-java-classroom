package com.company;

import java.io.File;
import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "\\files");
        if(file.exists()) {
            System.out.println("Файл/Директория существует");
            if(file.isDirectory()) {
                System.out.println(file.getPath() + " является директорией");
            } else {
                System.out.println(file.getPath() + " является файлом");
            }
        } else {
            System.out.println("Файл/Директория не существует");
        }

        System.out.println("Размер этого элемента равен: " + file.length() + " байтов.");

        if(file.isDirectory()) {
            String[] files = file.list();
            for(String f : files) {
                System.out.println(f);
            }
        }

        File newFile = new File(file.getPath() + "\\newFile.txt");
        try {
            if(newFile.createNewFile()) {
                System.out.println("Файл " + newFile.getPath() + "  создан");
            } else {
                System.out.println("Новый файл " + newFile.getPath() +  " создать не удалось");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
