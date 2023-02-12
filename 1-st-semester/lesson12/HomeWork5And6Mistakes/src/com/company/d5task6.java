package com.company;

import java.util.Scanner;

public class d5task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word: ");
        String s = "gfdgdgdfgdf fdgdfg dfg fdgdf g ваываываыв";

        boolean russian = false;
        boolean english = false;
        boolean mix = false;




        for (int i = 0; i < s.length(); i++) {
            if ( 'а' < s.charAt(i) && s.charAt(i) < 'я') {
                russian = true;

            }
            else if ( 'a' < s.charAt(i) && s.charAt(i) < 'z') {
                english = true;
            }
        }

        if (english == true && russian == true) {
            mix = true;

        }

        System.out.println("rus " + russian);
        System.out.println("eng " + english);

        System.out.println("mix " + mix);
    }
}