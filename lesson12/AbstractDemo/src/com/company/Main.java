package com.company;

import com.company.entity.Figure;
import com.company.entity.Rectangle;
import com.company.entity.Square;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(3.3);

        square.print();
        System.out.println("Площадь " + square + " равна " + square.area());

        Rectangle rectangle = new Rectangle(2.0, 3.0);
        rectangle.print();
        System.out.println("Площадь объекта " + rectangle + " равна " + rectangle.area());

        Figure[] figs = new Figure[2];

        figs[0] = square;
        figs[1] = rectangle;

        System.out.println(getAllFigArea(figs));

    }

    static double getAllFigArea(Figure[] figures) {
        double areas = 0;
        for(Figure fig : figures) {
            areas += fig.area();
        }
        return areas;
    }
}
