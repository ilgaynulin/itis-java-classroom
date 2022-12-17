package com.company.entity;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;


    public Student(String firstName, String lastName, String group, double averageMark) {
        if(firstName.isEmpty() || firstName == null || lastName.isEmpty() || lastName == null) {
            throw new IllegalArgumentException("Имя или фамилия пустые");
        }

        if(group.isEmpty() || group == null) {
            throw new IllegalArgumentException("Группа не может быть пустым");
        }

        if(averageMark <= 0.0 && averageMark >= 5.0) {
            throw new IllegalArgumentException("Средняя оценка за пределами возможных значений [0, 5]");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if(averageMark == 5.0) {
            return 3000.0;
        } else {
            return 2000.0;
        }
    }


    @Override
    public String toString() {
        return String.format("Студент: %s %s, Группа: %s, Средняя оценка: %.2f", firstName, lastName, group, averageMark);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
