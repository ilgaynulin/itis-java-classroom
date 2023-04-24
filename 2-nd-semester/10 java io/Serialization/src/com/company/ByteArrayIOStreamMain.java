package com.company;

import java.io.*;

public class ByteArrayIOStreamMain {
    public static void main(String[] args) {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bao);
            oos.writeObject("String object");
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = bao.toByteArray();
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            String string = (String) ois.readObject();
            System.out.println(string);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
