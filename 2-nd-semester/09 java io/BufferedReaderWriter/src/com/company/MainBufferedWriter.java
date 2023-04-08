package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class MainBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("write.txt"))) {
            bw.write(new Date() + "\n");
            for(int i = 0; i < 1000; i++) {
                bw.write(i + " ");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
