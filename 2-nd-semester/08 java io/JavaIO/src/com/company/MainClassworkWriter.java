package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MainClassworkWriter {
    public static void main(String[] args) {
        Random rand = new Random();
        FileWriter fw = null;
        try {
            fw = new FileWriter("writeOneHundredRandomNumbers.txt", );
            for(int i = 0; i < 50; i++) {
                fw.write(rand.nextInt(100) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
