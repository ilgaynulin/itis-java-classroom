package com.company;

import com.company.entity.Point2D;
import com.company.entity.Vector2D;

public class Main {

    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.0, 2.0);
        Point2D p2 = new Point2D(3.0, 3.0);

        Vector2D v1 = new Vector2D(p1, p2);
        Vector2D v2 = new Vector2D(new Point2D(1.0, 1.0), new Point2D(2.0, 0.0));

        System.out.println("v1");
        System.out.println(v1);
        System.out.println("v2");
        System.out.println(v2);

        System.out.println("Их сумма");
        System.out.println(v1.add(v2));

//        Vector2D v2 = v1.moveByP1(new Point2D(0.0, 2.0));
//
//        System.out.println(v1);
//        System.out.println(v2);

//        System.out.println("p1: " + p1);
//        System.out.println("p2: " + p2);
//        System.out.println(p1.equals(p2));

    }
}
