package com.company;

import java.io.*;
import java.util.Random;

public class MainPic {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("pic.jpg");
        int size = is.available();
        byte[] pic = new byte[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            pic[i] = (byte)rand.nextInt(127);
        }
        OutputStream os = new FileOutputStream("out.jpg");
        os.write(pic);

//        is.read(pic);
//        System.out.println();
    }
}
