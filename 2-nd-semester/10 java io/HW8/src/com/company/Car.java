package com.company;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private int year;
    private double mileage;

    Car(String model, int year, double mileage){
        this.model = model;
        this.year=year;
        this.mileage=mileage;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }
}
