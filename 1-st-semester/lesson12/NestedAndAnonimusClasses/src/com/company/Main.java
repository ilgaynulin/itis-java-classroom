package com.company;

import com.company.entity.Employee;
import com.company.impl.PositionFromStorage;
import com.company.interfaces.Position;
import com.company.nested.Car;
import com.company.nested.PointDistanceCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        double distance = PointDistanceCalculator
//                .calculateDistanceBetweenPoints(1.0, 2.0, 3.0, 4.0);
//        System.out.println(distance);
//
//        Car car = new Car();
//
//        car.start();

        Position positionFromConsole = new Position() {
            @Override
            public String givePosition() {
                System.out.println("Введите должность работника");
                Scanner in = new Scanner(System.in);
                String position = in.nextLine();
                return position;
            }
        };

        Employee em = new Employee("Ильяс");
        em.setPosition(positionFromConsole);
        System.out.println(em);
    }
}
