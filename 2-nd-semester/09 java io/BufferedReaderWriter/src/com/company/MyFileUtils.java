package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class MyFileUtils {
    public static void main(String[] args) {
        String directoryPath = System.getProperty("user.dir") + "\\files";
        System.out.println("Размер директории " + directoryPath + ": ");
        System.out.println(dirLength(directoryPath));
    }

    public static long dirLength(String path) {
        File dir = new File(path);

        if(!dir.exists()) {
            new FileNotFoundException("Не найдена директория по пути: " + path);
        } else if(!dir.isDirectory()) {
            new IllegalArgumentException("По указанному пути нет директории");
        }
        return dirLength(dir);
    }

    public static long dirLength(File directory) {
        int size = 0;
        File[] files = directory.listFiles();
        for(File f : files) {
            if(f.isFile()) {
                size += f.length();
            } else {
                size += dirLength(f);
            }
        }
        return size;
    }
}
