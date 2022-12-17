package com.company;

import com.company.enums.Gender;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    Person p = new Person("Настя", 20, Gender.HELICOPTER);

//        if(p.getGender() == Gender.MALE) {
//            System.out.println(p.getName() + " мужчина");
//        } else {
//            System.out.println(p.getName() + " женщина");
//        }

        System.out.println(p.getName() + " Пол: " + p.getGender().rusName);

//        switch (p.getGender()) {
//            case MALE:
//                System.out.println(p.getName() + " мужчина");
//                break;
//            case FEMALE:
//                System.out.println(p.getName() + " женщина");
//                break;
//            case UNDEFINED:
//                System.out.println(p.getName() + " неизвестного пола");
//            default:
//                throw new IllegalStateException("Неизвестный пол " );
//        }
    }
}
