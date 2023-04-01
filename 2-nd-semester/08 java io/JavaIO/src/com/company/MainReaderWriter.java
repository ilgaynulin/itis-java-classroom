package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class MainReaderWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("writeWithWriter.txt");
            String str = "Я записываю в файл";
            fw.write(str);
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
