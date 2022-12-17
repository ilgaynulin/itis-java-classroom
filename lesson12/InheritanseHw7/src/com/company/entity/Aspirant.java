package com.company.entity;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);

        if(scientificWork.isEmpty() || scientificWork == null) {
            throw new IllegalArgumentException("Научная работа не может быть пустой");
        }
        this.scientificWork = scientificWork;
    }


    @Override
    public double getScholarship() {
        if(averageMark == 5.0) {
            return 5000.0;
        } else {
            return 3000.0;
        }
    }

    @Override
    public String toString() {
        return String.format("Студент: %s %s, Группа: %s, Научная работа: %s, Средняя оценка: %.2f", firstName, lastName, group, scientificWork, averageMark);
    }
}
