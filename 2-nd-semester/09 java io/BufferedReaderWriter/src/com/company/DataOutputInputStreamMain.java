package com.company;

import java.io.*;

public class DataOutputInputStreamMain {
    public static void main(String[] args) {
        int day = 1;
        try(DataOutputStream das = new DataOutputStream(new FileOutputStream("temperatures.txt"))) {
            das.writeInt(day);
            das.writeDouble(36.6);
            das.writeDouble(37.8);
            das.writeDouble(38.8);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("temperatures.txt"))) {
            int fromFileDay = dis.readInt();
            System.out.println("День " + fromFileDay + ":");
            double temp = dis.readDouble();
            System.out.printf("%,.2f\n", temp);
            temp = dis.readDouble();
            System.out.printf("%,.2f\n", temp);
            temp = dis.readDouble();
            System.out.printf("%,.2f\n", temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
