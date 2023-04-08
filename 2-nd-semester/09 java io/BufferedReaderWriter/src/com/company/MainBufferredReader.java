package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class MainBufferredReader {

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        String filename = "text.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            Stream<String> lines = br.lines();
            lines.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Файл с названием " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long timeEnd = System.currentTimeMillis();
        System.err.println("Buffered Reader read file in " + (timeEnd - timeStart) + " ms." );


        timeStart = System.currentTimeMillis();
        filename = "text.txt";
        FileReader fr = null;
        try {
            fr = new FileReader("text.txt");
            int i = fr.read();
            while(i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл с названием " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        timeEnd = System.currentTimeMillis();
        System.err.println("File Reader read file in " + (timeEnd - timeStart) + " ms." );
    }
}
