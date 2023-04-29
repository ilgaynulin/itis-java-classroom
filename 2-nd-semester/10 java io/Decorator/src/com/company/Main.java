package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        MyDataOutputStream myDataOutputStream = null;
        try {
            myDataOutputStream = new MyDataOutputStream(new FileOutputStream("myFile.dat"));
            myDataOutputStream.writeInt(11_212_421);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            MyDataInputStream myDataInputStream = new MyDataInputStream(new FileInputStream("myFile.dat"));
            System.out.println(myDataInputStream.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
