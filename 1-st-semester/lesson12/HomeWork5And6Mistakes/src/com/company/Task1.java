package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String regEx = "[A-ZА-Я]{1}\\d{3}[A-ZА-Я]{2}";
        ArrayList<String> nums = new ArrayList<String>();

        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(text);

        int count = 0;
        while(m.find()) {
            int foundBeginIndex = m.start();
            int foundEndIndex = m.end();
            nums.add(new String(text.substring(foundBeginIndex, foundEndIndex)));
            count++;
        }

        for(int i = 0; i < count; i++){
            System.out.print(nums.get(i) + " ");
        }
    }
}