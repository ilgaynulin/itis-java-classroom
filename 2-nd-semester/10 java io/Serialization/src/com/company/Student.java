package com.company;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student implements Serializable {
    private static final long serialVersionUID = 1;

    private String name;
    private double gradeAvg;
    private Date birthDate;
    private transient int age;

    public Student(String name, double gradeAvg, Date birthDate) {
        this.name = name;
        this.gradeAvg = gradeAvg;
        this.birthDate = birthDate;
        this.updateAge();
    }

    private void updateAge() {
        Calendar now = Calendar.getInstance();
        Calendar birthDateCalendar = Calendar.getInstance();
        birthDateCalendar.setTime(birthDate);

        this.age = now.get(Calendar.YEAR) - birthDateCalendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "Студент: " +
                "Имя: " + name + '\'' +
                ", Средний балл: " + gradeAvg +
                ", Дата рождения: " + birthDate +
                ", Возраст: " + age;
    }
}
