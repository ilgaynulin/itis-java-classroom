package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("hello.txt");
            int i = is.read();
            while(i != -1) {
                System.out.print((char) i);
                i = is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Читаем массив байтов и преобразуем в строку");
        InputStream is = null;
        try {
            is = new FileInputStream("helloUTF8.txt");
            int length = is.available();
            byte[] bytes = is.readAllBytes();
            String str = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        OutputStream os = null;
        try {
            os = new FileOutputStream("write.txt");
            String str = "Я записал в файл";
            byte[] byteToWrite = str.getBytes(StandardCharsets.UTF_8);
            os.write(byteToWrite);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
