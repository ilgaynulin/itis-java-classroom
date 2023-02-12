package com.company.entity;

public abstract class ColorFigure extends Figure {
    private String color = "Прозрачная";

    public void print() {
        System.out.println("Я " + color + " фигура!");
    }
}
