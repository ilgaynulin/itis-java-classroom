package com.company;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // класс Date
//        Date now = new Date();
//        System.out.println(now);
//        try {
//            Thread.sleep(5*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(now);

        // -----------------------

        Student student1 = new Student("Валера", 4.5,
                new GregorianCalendar(1990, Calendar.FEBRUARY, 21).getTime());
        Student student2 = new Student("Лиза", 4.5,
                new GregorianCalendar(1992, Calendar.MARCH, 12).getTime());

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.out"));
            outputStream.writeObject(student1);
            outputStream.writeObject(student2);
            System.out.println("Запись студентов завершена");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // -----------------------------------

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("students.out"));
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
            student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
